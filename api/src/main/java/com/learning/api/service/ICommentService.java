package com.learning.api.service;

import com.learning.api.model.Comments;
import com.learning.api.repository.CommentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICommentService implements CommentService {

  @Autowired
  private CommentRepository cRepository;

  // private static List<Comments> list = new ArrayList<>();
  // static {
  //   Comments c = new Comments();
  //   c.setName("jack");
  //   c.setTopic("projects");
  //   c.setBody("Nice Work");
  //   list.add(c);
  // }

  @Override
  public List<Comments> getComments() {
    return cRepository.findAll();
  }

  @Override
  public Comments saveComments(Comments comments) {
    return cRepository.save(comments);
  }

  @Override
  public Comments getSingleComment(Long id) {
    Optional<Comments> comment = cRepository.findById(id);
    if (comment.isPresent()) {
      return comment.get();
    }
    throw new RuntimeException("Comment not found for id " + id);
  }

  @Override
  public void deleteComment(long id) {
    cRepository.deleteById(id);
  }

  @Override
  public Comments updateComments(Comments comments) {
    return cRepository.save(comments);
  }
}
