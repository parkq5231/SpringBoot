package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Reply;
import com.example.demo.repository.ReplyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest // auto config
@Transactional
public class ReplyRepositoryClient {
	@Autowired
	ReplyRepository repository;

	@Test
	@Commit
	public void 댓글저장() {
		Reply reply = Reply.builder().title("kim")//
				.contents("kimbab3").build();
		repository.save(reply);
	}// end of save

	@Test
	public void 댓글조회() {
		// jpql
		List<Reply> list = repository.findAll();
		System.out.println(list);
	}// end of findAll

	@Test
	public void 제목조회() {
		List<Reply> list = repository.findByTitle("kim");
		System.out.println(list);
	}// end of findByTitle
}