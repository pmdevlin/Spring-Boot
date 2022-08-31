package com.portfolio.springportfolio.service;

import com.portfolio.springportfolio.model.Comments;
import java.util.List;

public interface ICommentsService {
  List<Comments> findAll();
}
