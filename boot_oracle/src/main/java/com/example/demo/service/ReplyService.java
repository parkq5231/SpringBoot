package com.example.demo.service;

import com.example.demo.domain.Reply;

public interface ReplyService {
	// 등록
	void insertReply(Reply reply);

	// 조회
	Iterable<Reply> selectAll();
}
