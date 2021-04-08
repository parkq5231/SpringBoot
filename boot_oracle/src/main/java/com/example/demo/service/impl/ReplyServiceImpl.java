package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Reply;
import com.example.demo.repository.ReplyRepository;
import com.example.demo.service.ReplyService;

@Service // spring context bean 등록
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyRepository repo;

	// 등록
	@Override
	public void insertReply(Reply reply) {
		repo.save(reply);
	}

	// 조회
	@Override
	public Iterable<Reply> selectAll() {
		return repo.findAll();
	}

}
