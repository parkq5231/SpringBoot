package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Reply;

public interface ReplyService {
	// 등록
	void insertReply(Reply reply);

	// 조회
	Iterable<Reply> selectAll();

	// 제목으로 조회
	List<Reply> findByTitleLike(String title);
}
