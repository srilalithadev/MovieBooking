package com.agi.moviebooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Wishlist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long wid;
	private long uid;
	private long pid;
	public Wishlist() {
		super();
		this.setUid(uid);
		this.setPid(pid);
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	
	

}
