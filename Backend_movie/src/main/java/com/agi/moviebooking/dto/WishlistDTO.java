package com.agi.moviebooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishlistDTO {
	private long wid;
	private long uid;
	private long pid;
	public WishlistDTO(long uid, long pid) {
		super();
		this.setUid(uid);
		this.setPid(pid);
	}
	public long getWid() {
		return wid;
	}
	public void setWid(long wid) {
		this.wid = wid;
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
