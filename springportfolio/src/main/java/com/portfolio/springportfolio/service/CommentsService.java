package com.portfolio.springportfolio.service;

import com.portfolio.springportfolio.model.Comments;
import com.portfolio.springportfolio.repository.CommentsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService implements ICommentsService {

  @Autowired
  private CommentsRepository repository;

  @Override
  public List<Comments> findAll() {
    var comments = (List<Comments>) repository.findAll();
    return comments;
  }
}
