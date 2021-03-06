package com.sun366.entity;

// Generated 2015-4-29 17:41:08 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Achievement generated by hbm2java
 */
@Entity
@Table(name = "achievement", catalog = "sun366")
public class Achievement implements java.io.Serializable {

	private String id;
	private String teaId;
	private String name;
	private Date time;
	private String describe;
	private Date modified;

	public Achievement() {
	}

	public Achievement(String id) {
		this.id = id;
	}

	public Achievement(String id, String teaId, String name, Date time,
			String describe, Date modified) {
		this.id = id;
		this.teaId = teaId;
		this.name = name;
		this.time = time;
		this.describe = describe;
		this.modified = modified;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "tea_id", length = 32)
	public String getTeaId() {
		return this.teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	@Column(name = "name", length = 256)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "time", length = 10)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "describe", length = 2048)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified", length = 19)
	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

}
