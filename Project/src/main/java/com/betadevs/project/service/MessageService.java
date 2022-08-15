package com.betadevs.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betadevs.project.model.Messages;
import com.betadevs.project.repo.MessagesRepo;

@Service
public class MessageService {

	@Autowired
	private MessagesRepo messagesRepo;

	public List<Messages> getAllMessages() {
		return messagesRepo.findAll();
	}
	
	
}
