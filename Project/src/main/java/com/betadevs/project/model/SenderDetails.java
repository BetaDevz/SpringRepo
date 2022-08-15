package com.betadevs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="senderdetails")
public class SenderDetails {

	@Id
	private long customerId;
	private String accountHolderName;
	private int balance;
	private String overdraft;
	public SenderDetails() {
		super();
	}
	public SenderDetails(long customerId, String accountHolderName, int balance, String overdraft) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}	
}
