package com.betadevs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betadevs.project.model.Messages;
import com.betadevs.project.service.MessageService;

@CrossOrigin
@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@GetMapping("/allMessages")
	public List<Messages> getAllMessages(){
		return messageService.getAllMessages();		
	}
}
