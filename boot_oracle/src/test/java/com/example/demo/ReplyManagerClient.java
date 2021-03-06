package com.example.demo;

//assert
import static org.hamcrest.MatcherAssert.assertThat;
//is
import static org.hamcrest.Matchers.is;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Reply;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest // auto config
@Transactional
public class ReplyManagerClient {
	@Autowired
	EntityManager em;

	@Test
	@Commit
	public void 댓글저장() {
		Reply reply = Reply.builder().title("kim")//
				.contents("kimbab2").build();
		em.persist(reply);
		assertThat(em.find(Reply.class, reply.getSeq()), is(reply));// pk로 조회해서 담고 is로 비교
	}

	@Test
	public void 댓글조회() {
		// persist = insert
		// merge = update
		// remove = delete
		// find = select

		// jpql
		List<Reply> list = em.createQuery("from Reply", Reply.class).getResultList();
		System.out.println(list);
	}

}// end of class