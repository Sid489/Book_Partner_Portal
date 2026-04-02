package com.cg.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

/*
 * @author Siddhant
*/
@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, String> {

    @Query("SELECT e FROM Employee e JOIN FETCH e.job j WHERE e.publisher.pubId = :pubId")  // For API GET /api/publishers/{pub_id}/employees-with-jobs
    public List<Employee> findEmployeesWithJobsByPublisherId(@Param("pubId") String pubId);
}
