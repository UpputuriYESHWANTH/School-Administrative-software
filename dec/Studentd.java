package com.student.dec;

public class Studentd {
	
	int sno;
	String sname;
	String sadd;
	long mobilen;
	
	public Studentd(int sno, String sname, String sadd, long mobilen) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.mobilen = mobilen;
	}

	public Studentd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public long getMobilen() {
		return mobilen;
	}

	public void setMobilen(long mobilen) {
		this.mobilen = mobilen;
	}

	public static void main(String[] args) {
		
	}

}
