package com.caracore.crm.data.service;

import com.caracore.crm.data.entity.Company;
import com.caracore.crm.data.entity.Contact;
import com.caracore.crm.data.entity.Status;
import com.caracore.crm.data.repository.CompanyRepository;
import com.caracore.crm.data.repository.ContactRepository;
import com.caracore.crm.data.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrmService {

	private final ContactRepository contactRepository;
	private final CompanyRepository companyRepository;
	private final StatusRepository statusRepository;

	public CrmService(ContactRepository contactRepository, CompanyRepository companyRepository,
			StatusRepository statusRepository) {
		this.contactRepository = contactRepository;
		this.companyRepository = companyRepository;
		this.statusRepository = statusRepository;
	}

	public List<Contact> findAllContacts(String stringFilter) {
		if (stringFilter == null || stringFilter.isEmpty()) {
			return contactRepository.findAll();
		} else {
			return contactRepository.search(stringFilter);
		}
	}

	public long countContacts() {
		return contactRepository.count();
	}

	public void deleteContact(Contact contact) {
		contactRepository.delete(contact);
	}

	public void saveContact(Contact contact) {
		if (contact == null) {
			System.err.println("Contact is null. Are you sure you have connected your form to the application?");
			return;
		}
		contactRepository.save(contact);
	}

	public List<Company> findAllCompanies() {
		return companyRepository.findAllNative();
	}

	public List<Status> findAllStatuses() {
		return statusRepository.findAll();
	}

	public  long getEmployeeCount(Long id) {
		return companyRepository.getEmployeeCount(id);
	}
}