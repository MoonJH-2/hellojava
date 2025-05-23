package com.javaex.problem01;

public class Member {
	private String id; // 회원 아이디
	private String name; // 회원 이름
	private int point; // 회원 포인트

	public Member() {
	}

	/**
	 * @param id
	 * @param name
	 * @param point
	 */
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
