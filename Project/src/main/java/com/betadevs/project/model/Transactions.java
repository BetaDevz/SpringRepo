package com.betadevs.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="transactions")
public class Transactions {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer transactionId;
	@ManyToOne
	private SenderDetails senderDetails;
	@ManyToOne
	private TransferType transferType;
	@ManyToOne
	private Receiver receiver;
	private String receiverAccountHolderName;
    private Long receiverAccountNumber;
    @ManyToOne
    private Messages messages;
    private Integer amount;
    private String transactionDate;
    private String status;
	public Transactions() {
		super();
	}
	public Transactions(Integer transactionId, SenderDetails senderDetails, TransferType transferType,
			Receiver receiver, String receiverAccountHolderName, Long receiverAccountNumber, Messages messages,
			Integer amount, String transactionDate, String status) {
		super();
		this.transactionId = transactionId;
		this.senderDetails = senderDetails;
		this.transferType = transferType;
		this.receiver = receiver;
		this.receiverAccountHolderName = receiverAccountHolderName;
		this.receiverAccountNumber = receiverAccountNumber;
		this.messages = messages;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.status = status;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public SenderDetails getSenderDetails() {
		return senderDetails;
	}
	public void setSenderDetails(SenderDetails senderDetails) {
		this.senderDetails = senderDetails;
	}
	public TransferType getTransferType() {
		return transferType;
	}
	public void setTransferType(TransferType transferType) {
		this.transferType = transferType;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public String getReceiverAccountHolderName() {
		return receiverAccountHolderName;
	}
	public void setReceiverAccountHolderName(String receiverAccountHolderName) {
		this.receiverAccountHolderName = receiverAccountHolderName;
	}
	public Long getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public void setReceiverAccountNumber(Long receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}
	public Messages getMessages() {
		return messages;
	}
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    	
}
