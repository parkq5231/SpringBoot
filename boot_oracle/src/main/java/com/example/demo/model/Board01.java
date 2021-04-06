package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

//VO = domain
@Entity
@Data
@Table(name = "board02")
public class Board01 {
	@Id
	@GeneratedValue
	private Integer seq;
	@Transient//생성시 제외
	private String title;
	private String contents;
}