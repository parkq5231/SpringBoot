package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Reply;

public interface ReplyRepository extends PagingAndSortingRepository<Reply, Long> {
	
	 List<Reply> findByTitleLike(String title);
	 List<Reply> findByTitle(String title);

}