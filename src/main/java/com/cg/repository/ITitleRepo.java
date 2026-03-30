package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Title;
/*
 * @author Siddhant*/
@Repository
public interface ITitleRepo extends JpaRepository<Title, String> {

}

