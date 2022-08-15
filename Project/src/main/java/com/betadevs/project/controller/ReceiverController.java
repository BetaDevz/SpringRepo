package com.betadevs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betadevs.project.model.Receiver;
import com.betadevs.project.service.ReceiverService;

@CrossOrigin
@RestController
public class ReceiverController {

	@Autowired
	private ReceiverService receiverService;
	
	@GetMapping("/allReceivers")
	public List<Receiver> getAllReceivers(){
		System.out.println(receiverService.getAllReceivers());
		return receiverService.getAllReceivers();		
	}
	
}
