package com.betadevs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betadevs.project.model.Messages;

public interface MessagesRepo extends JpaRepository<Messages, String>{

}
