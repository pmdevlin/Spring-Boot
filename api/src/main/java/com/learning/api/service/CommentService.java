package com.learning.api.service;

import com.learning.api.model.Comments;
import java.util.List;

public interface CommentService {
  List<Comments> getComments();

  Comments saveComments(Comments comments);

  Comments getSingleComment(Long id);

  void deleteComment(long id);

  Comments updateComments(Comments comments);
}
