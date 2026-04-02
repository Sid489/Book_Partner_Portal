package com.cg.service;

import com.cg.dto.AuthorBookPublisherDTO;
import com.cg.dto.AuthorRoyaltyDTO;
import com.cg.dto.BestSellingBookDTO;

import java.util.List;

//@author Deependra
public interface IAuthorService {

    List<AuthorBookPublisherDTO> getAuthorsWithBooksAndPublishers();

    List<BestSellingBookDTO> getBestSellingBooks();

    List<AuthorRoyaltyDTO> getAuthorsWithRoyaltyRange();
}
