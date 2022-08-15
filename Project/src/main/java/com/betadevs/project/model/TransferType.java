package com.betadevs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transferTypes")
public class TransferType {

	@Id
	private String transferTypeCode;
	private String transferTypeDescription;
	public TransferType() {
		super();
	}
	public TransferType(String transferTypeCode, String transferTypeDescription) {
		super();
		this.transferTypeCode = transferTypeCode;
		this.transferTypeDescription = transferTypeDescription;
	}
	public String getTransferTypeCode() {
		return transferTypeCode;
	}
	public void setTransferTypeCode(String transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}
	public String getTransferTypeDescription() {
		return transferTypeDescription;
	}
	public void setTransferTypeDescription(String transferTypeDescription) {
		this.transferTypeDescription = transferTypeDescription;
	}
		
}
