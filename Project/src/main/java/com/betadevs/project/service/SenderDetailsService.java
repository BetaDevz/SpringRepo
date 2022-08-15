package com.betadevs.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betadevs.project.model.SenderDetails;
import com.betadevs.project.repo.SenderDetailsRepo;

@Service
public class SenderDetailsService {

	@Autowired
	private SenderDetailsRepo senderDetailsRepo;
	
	public List<SenderDetails> getAllSenders() {
		return senderDetailsRepo.findAll();
	}

	
}
