package com.myproject.StackRouteCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.StackRouteCRUD.model.Trainer;



@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}
