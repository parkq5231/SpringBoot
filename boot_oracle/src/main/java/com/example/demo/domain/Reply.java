package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//VO = domain
@Data
@Entity
@Builder // 객체 할당
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
	@Id // pk
	@GeneratedValue // sequence를 의미
	private Integer seq;
	@Transient // 생성시 제외
	private String title;
	@Column(length = 100, name = "content")
	private String contents;
	private String writer;
}