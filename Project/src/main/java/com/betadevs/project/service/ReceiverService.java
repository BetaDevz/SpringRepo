package com.betadevs.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betadevs.project.model.Receiver;
import com.betadevs.project.repo.ReceiverRepo;

@Service
public class ReceiverService {

	@Autowired
	private ReceiverRepo receiverRepo;
	
	public List<Receiver> getAllReceivers() {
		return receiverRepo.findAll();
	}

}
