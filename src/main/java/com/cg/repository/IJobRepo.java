package com.cg.repository;

import com.cg.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@author Deependra
@Repository
public interface IJobRepo extends JpaRepository<Job, String> {
    //Queries
}
