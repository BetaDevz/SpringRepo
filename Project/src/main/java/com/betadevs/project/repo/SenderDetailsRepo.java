package com.betadevs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betadevs.project.model.SenderDetails;

public interface SenderDetailsRepo extends JpaRepository<SenderDetails, Long> {

}
