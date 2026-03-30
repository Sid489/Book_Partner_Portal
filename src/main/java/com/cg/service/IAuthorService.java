package com.cg.service;

import com.cg.dto.AuthorBookPublisherDTO;

import java.util.List;

public interface IAuthorService {
    List<AuthorBookPublisherDTO> getAuthorsWithBooksAndPublishers();
}
