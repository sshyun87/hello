package com.yedam.interfacePkg;

public class Audio implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

}
