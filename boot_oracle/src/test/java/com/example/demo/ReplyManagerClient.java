package com.example.demo;

import static org.hamcrest.MatcherAssert.*;//assert
import static org.hamcrest.Matchers.*;//is

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
	public void save() {
		Reply reply = Reply.builder().title("kim")//
				.contents("kimbab2").build();
		em.persist(reply);
		assertThat(em.find(Reply.class, reply.getSeq()), is(reply));// pk로 조회해서 담고 is로 비교
	}

}// end of class