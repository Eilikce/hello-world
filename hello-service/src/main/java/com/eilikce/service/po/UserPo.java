package com.eilikce.service.po;

public class UserPo {
	private String name;
	private String sex;
	private String userId;
	private int age;
	
	public UserPo(String name, String sex, String userId, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.userId = userId;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "UserPo [name=" + name + ", sex=" + sex + ", userId=" + userId + ", age=" + age + "]";
	}
	
}
