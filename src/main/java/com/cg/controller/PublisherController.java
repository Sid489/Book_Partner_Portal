package com.cg.controller;

import com.cg.dto.PublisherEmployeeResponseDTO;
import com.cg.dto.TopPublisherDTO;
import com.cg.service.impl.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
* @author Siddhant
* APIs for Returns publishers ranked by total sales or revenue and Returns all employees working under a specific publisher along with their job details.*/
@RestController
@RequestMapping("/api/publishers")
public class PublisherController {
    //    @Autowired
    private final PublisherServiceImpl Psimpl;
    public PublisherController(PublisherServiceImpl Psimpl){

        this.Psimpl=Psimpl;
    }
    @GetMapping("/{pubId}/employees-with-jobs")
    public PublisherEmployeeResponseDTO getEmployeesWithJobs(
            @PathVariable String pubId) {

        return Psimpl.getEmployeesWithJobs(pubId);
    }
    @GetMapping("/top-performing")
    public List<TopPublisherDTO> getTopPerformingPublishers(){
        return Psimpl.getTopPerformingPublishers();
    }

}

