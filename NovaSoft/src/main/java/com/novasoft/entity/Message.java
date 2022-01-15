package com.novasoft.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Message {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long messageId;
	private String messageContent;
	private Date createdAt;
	private Long senderId;
	private Long receiverId;
	private Date seenDate;
	private Boolean isModified;
	private int modificationNum;
	

	
	public Message() {
		super();
	}
	
	
	public Message(String messageContent, Date createdAt, Long senderId, Long receiverId, Date seenDate,
			Boolean isModified, int modificationNum, Discussion discussion) {
		super();
		this.messageContent = messageContent;
		this.createdAt = createdAt;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.seenDate = seenDate;
		this.isModified = isModified;
		this.modificationNum = modificationNum;
		this.discussion = discussion;
	}
	


	public Boolean getIsModified() {
		return isModified;
	}



	public void setIsModified(Boolean isModified) {
		this.isModified = isModified;
	}



	public int getModificationNum() {
		return modificationNum;
	}



	public void setModificationNum(int modificationNum) {
		this.modificationNum = modificationNum;
	}



	public Date getSeenDate() {
		return seenDate;
	}

	public void setSeenDate(Date seenDate) {
		this.seenDate = seenDate;
	}

	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Long getSenderId() {
		return senderId;
	}
	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}
	public Long getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(Long receiverId) {
		this.receiverId = receiverId;
	}
	
	
	//link 
	
	@ManyToOne
	Discussion discussion;


	public Discussion getDiscussion() {
		return discussion;
	}


	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}


	
	
	
	

}
