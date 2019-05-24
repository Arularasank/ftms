package com.ftms.common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
/*@JsonIgnoreProperties(
			value={"createdOn","updatedOn"},
			allowGetters = true
		)*/

public abstract class AuditModel implements Serializable {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on", nullable = false, updatable = false)
	@CreatedDate
	@JsonIgnore
	private Date createdOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_on", nullable = false)
	@LastModifiedDate
	@JsonIgnore
	private Date updatedOn;

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	

}
