package com.betadevs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betadevs.project.model.SenderDetails;
import com.betadevs.project.service.SenderDetailsService;

@CrossOrigin
@RestController
public class SenderDetailsController {
	
	@Autowired
	private SenderDetailsService senderDetailsService;

	@GetMapping("/allSenders")
	public List<SenderDetails> getAllSenders(){
		return senderDetailsService.getAllSenders();
	}
}
