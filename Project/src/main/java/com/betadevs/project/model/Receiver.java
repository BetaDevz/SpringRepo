package com.betadevs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receiver")
public class Receiver {

	@Id
	private String BIC;
	private String RecInstitutionName;
	
	public Receiver() {
		super();
	}

	public Receiver(String bIC, String recInstitutionName) {
		super();
		BIC = bIC;
		RecInstitutionName = recInstitutionName;
	}

	public String getBIC() {
		return BIC;
	}

	public void setBIC(String bIC) {
		BIC = bIC;
	}

	public String getRecInstitutionName() {
		return RecInstitutionName;
	}

	public void setRecInstitutionName(String recInstitutionName) {
		RecInstitutionName = recInstitutionName;
	}	
}
