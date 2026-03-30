package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.TitleAuthor;
import com.cg.entity.TitleAuthorId;
/*
 * @author Siddhant*/
@Repository
public interface ITitleAuthor extends JpaRepository<TitleAuthor, TitleAuthorId> {

}
