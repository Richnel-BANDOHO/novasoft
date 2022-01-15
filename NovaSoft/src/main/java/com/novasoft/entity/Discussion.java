package com.novasoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Discussion  implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long discussionId;
	private Long destinataireId;
	private Long expediteurId;
	private Date creationDiscussionDate;
	
	@OneToMany( cascade = CascadeType.ALL)
	private List<Message> message;

	public Discussion() {
		super();
	}

	
	
	public Discussion(Long destinataireId, Long expediteurId, Date creationDiscussionDate, List<Message> message) {
		super();
		this.destinataireId = destinataireId;
		this.expediteurId = expediteurId;
		this.creationDiscussionDate = creationDiscussionDate;
		this.message = message;
	}



	public Long getDiscussionId() {
		return discussionId;
	}

	public void setDiscussionId(Long discussionId) {
		this.discussionId = discussionId;
	}

	public Long getDestinataireId() {
		return destinataireId;
	}

	public void setDestinataireId(Long destinataireId) {
		this.destinataireId = destinataireId;
	}

	public Long getExpediteurId() {
		return expediteurId;
	}

	public void setExpediteurId(Long expediteurId) {
		this.expediteurId = expediteurId;
	}

	public Date getCreationDiscussionDate() {
		return creationDiscussionDate;
	}

	public void setCreationDiscussionDate(Date creationDiscussionDate) {
		this.creationDiscussionDate = creationDiscussionDate;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

	
	

	


	
	
	
	
}
