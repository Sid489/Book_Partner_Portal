package com.cg.service;
import com.cg.dto.*;

import java.util.List;

/*
* @author Siddhant
*/
public interface PublisherService {

    PublisherEmployeeResponseDTO getEmployeesWithJobs(String pubId); //Method for API Endpoint Number 4

    List<TopPublisherDTO> getTopPerformingPublishers();
}

