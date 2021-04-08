package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {
	@Autowired
	ReplyService replyService;

	// 등록
	
	// 조회
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", replyService.selectAll());
		return "list";
	}

}
