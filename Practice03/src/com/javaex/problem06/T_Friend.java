package com.javaex.problem06;

public class T_Friend {
	private String name;
	private String hp;
	private String school;

	// 필요한 메소드 작성

	/**
	 * @param name
	 * @param hp
	 * @param school
	 */
	public T_Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	/**
	 * 
	 */
	public T_Friend() {
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void showInfo() {
		System.out.println("이름:" + name + "  핸드폰:" + hp + "  학교:" + school);
	}

	@Override
	public String toString() {
		return "T_Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
	
	
}
