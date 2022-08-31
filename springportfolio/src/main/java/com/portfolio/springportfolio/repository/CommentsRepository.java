package com.portfolio.springportfolio.repository;

import com.portfolio.springportfolio.model.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends CrudRepository<Comments, Long> {}
