package com.javaStudy.interfaceEx1;

public class Audio implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끔니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLME) {
			this.volume = RemoteControl.MAX_VOLME;
		} else if (volume < RemoteControl.MIN_VOLME) {
			this.volume = RemoteControl.MIN_VOLME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재  Audio 볼륨 : " + this.volume);
	}

}
