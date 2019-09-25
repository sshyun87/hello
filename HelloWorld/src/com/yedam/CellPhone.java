package com.yedam;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone() {
		super();//부모 class의 생성자를 가지고 오겠다.
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}
