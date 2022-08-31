package com.portfolio.springportfolio.controller;

import com.portfolio.springportfolio.model.Comments;
import com.portfolio.springportfolio.service.ICommentsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

  @Autowired
  private ICommentsService commentsService;

  @GetMapping("/showComments")
  public String findComments(Model model) {
    var comments = (List<Comments>) commentsService.findAll();

    model.addAttribute("comments", comments);

    return "showComments";
  }
}
