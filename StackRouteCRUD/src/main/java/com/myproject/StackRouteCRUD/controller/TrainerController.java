package com.myproject.StackRouteCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.StackRouteCRUD.model.Trainer;
import com.myproject.StackRouteCRUD.repository.TrainerRepository;

import javax.validation.Valid;
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/trainer-management")
public class TrainerController {
	@Autowired
private TrainerRepository trainerRepository;
	@GetMapping("/trainers")
	public List<Trainer> getAllTrainers()
	{
		return trainerRepository.findAll();
	}
	
	@PostMapping("/trainers")
	public Trainer createTrainer(@RequestBody Trainer trainer ) {
		return trainerRepository.save(trainer);
}
}