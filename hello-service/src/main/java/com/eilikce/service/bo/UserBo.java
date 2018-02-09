package com.eilikce.service.bo;

public class UserBo {
	private String name;
	private String sex;
	private String userId;
	private int age;
	
	private String addr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "UserBo [name=" + name + ", sex=" + sex + ", userId=" + userId + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
