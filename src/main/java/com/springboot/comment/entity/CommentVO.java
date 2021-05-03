package com.springboot.comment.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BOARD_COMMENT")
@Getter @Setter @ToString
public class CommentVO {
	
	@Id
	@GeneratedValue
	private int comment_no;
	private int no;
	private String writer;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date regDate = new Date();
	
}
