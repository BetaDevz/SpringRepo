package com.betadevs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Messages")
public class Messages {

	@Id
	private String messageCode;
	private String instruction;
	public Messages() {
		super();
	}
	public Messages(String messageCode, String instruction) {
		super();
		this.messageCode = messageCode;
		this.instruction = instruction;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}
