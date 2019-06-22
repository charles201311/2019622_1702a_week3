package com.chunboyang.week3.domain;

import java.util.Date;

/**
 * 
 * @ClassName: Company 
 * @Description: 公司信息
 * @author: charles
 * @date: 2019年6月21日 上午8:57:14
 */
public class Company {
     //公司ID
	private Integer cid;
	//公司名称
	private String cname;
	//注册资本
	private Integer money;
	//法人
	private String person;
	//注册时间
	private Date created;
	//公司类型
	private Integer tid;
	
	
	
	public Company() {
		super();
	}
	public Company(String cname, Integer money, String person, Date created, Integer tid) {
		super();
		this.cname = cname;
		this.money = money;
		this.person = person;
		this.created = created;
		this.tid = tid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
	
}
