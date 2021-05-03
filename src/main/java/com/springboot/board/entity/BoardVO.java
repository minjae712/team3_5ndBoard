package com.springboot.board.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//VO(Value Object)

@Entity
@Table(name="BOARD")
@Getter @Setter @ToString
public class BoardVO {

	@Id
	@GeneratedValue
	private int seq;
	private String title;
	private String writer;
	private String content;
	
	@Temporal(TemporalType.DATE)
	private Date regDate = new Date();
	private int cnt;

	public BoardVO() {};
	
	@Builder
	public BoardVO(int seq, String title, String writer, String content, Date regDate, int cnt) {
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.cnt = cnt;
	}
	
	
	
}