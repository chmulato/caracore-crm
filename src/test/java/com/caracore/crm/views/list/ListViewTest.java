
package com.caracore.crm.views.list;

import com.caracore.crm.data.service.CrmService;

import com.caracore.crm.data.entity.Contact;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.data.provider.ListDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ActiveProfiles;
// ...existing imports...
import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ListViewTest {

    private CrmService crmService;
    private ListView listView;

    @Before
    public void setup() {
        crmService = Mockito.mock(CrmService.class);

        Contact contact = new Contact();
        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setEmail("john@doe.com");

        Mockito.when(crmService.findAllContacts(Mockito.anyString())).thenReturn(Collections.singletonList(contact));
        Mockito.when(crmService.findAllCompanies()).thenReturn(Collections.emptyList());
        Mockito.when(crmService.findAllStatuses()).thenReturn(Collections.emptyList());

        listView = new ListView(crmService);
    }

    @Test
    public void formShownWhenContactSelected() {
        Grid<Contact> grid = listView.grid;
        Contact firstContact = getFirstItem(grid);

        ContactForm form = listView.form;

        Assert.assertFalse(form.isVisible());
        grid.asSingleSelect().setValue(firstContact);
        Assert.assertTrue(form.isVisible());
        Assert.assertEquals(firstContact.getFirstName(), form.firstName.getValue());
    }

    @SuppressWarnings("unchecked")
    private Contact getFirstItem(Grid<Contact> grid) {
        return ((ListDataProvider<Contact>) grid.getDataProvider()).getItems().iterator().next();
    }
}