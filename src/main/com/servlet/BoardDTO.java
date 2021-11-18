package com.servlet;

import java.util.Date;

public class BoardDTO {
	int bId;
	String title;
	String content;
	Date createDate;
	Date updateDate;
	String writer;
	//String[] tags;
	
	// 기본 생성자
	public BoardDTO() {
	
	}
	
	// Insert
	public BoardDTO(String title, String content, String writer/*, String[] tags*/) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		/*
		if(tags != null) {
			for() {
				//this.tags.strcpy(tags);
			}
		}
		*/
	}
	
	
	public int getBId() {
		return bId;
	}
	public void setBId(int bId) {
		this.bId = bId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writerId) {
		this.writer = writerId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setUpdateDate(Date udate) {
		this.updateDate = udate;
	}
	/*
	public String[] getTag() {
		return tag;
	}
	public void setTag(String[] tag) {
		this.tag = tag;
	}
	*/
	
}
