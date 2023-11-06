package com.caracore.crm.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "status", schema = "caracore_crm")
public class Status extends AbstractEntity {
    
	private String name;

    public Status() {

    }

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
