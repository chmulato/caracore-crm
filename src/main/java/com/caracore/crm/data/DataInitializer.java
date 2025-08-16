package com.caracore.crm.data;

import com.caracore.crm.data.entity.Company;
import com.caracore.crm.data.entity.Contact;
import com.caracore.crm.data.entity.Status;
import com.caracore.crm.data.repository.CompanyRepository;
import com.caracore.crm.data.repository.ContactRepository;
import com.caracore.crm.data.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Component
@Profile({"docker","local"})
public class DataInitializer implements CommandLineRunner {

    private final CompanyRepository companyRepository;
    private final ContactRepository contactRepository;
    private final StatusRepository statusRepository;

    @Value("${demo.extra:false}")
    private boolean extra;

    public DataInitializer(CompanyRepository companyRepository, ContactRepository contactRepository, StatusRepository statusRepository) {
        this.companyRepository = companyRepository;
        this.contactRepository = contactRepository;
        this.statusRepository = statusRepository;
    }

    @Override
    public void run(String... args) {
        if (!extra) {
            return; // data.sql already loads base data
        }
        if (contactRepository.count() > 60) {
            return; // already have extra data
        }
        List<Status> statuses = statusRepository.findAll();
        List<Company> companies = companyRepository.findAll();
        if (statuses.isEmpty() || companies.isEmpty()) {
            return; // rely on data.sql
        }
        Random random = new Random();
        IntStream.rangeClosed(61, 200).forEach(id -> {
            Contact c = new Contact();
            c.setFirstName("User" + id);
            c.setLastName("Demo");
            c.setEmail("user" + id + "@example.com");
            c.setCompany(companies.get(random.nextInt(companies.size())));
            c.setStatus(statuses.get(random.nextInt(statuses.size())));
            contactRepository.save(c);
        });
    }
}
