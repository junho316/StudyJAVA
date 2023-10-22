package com.javaStudy.absClassEx2;

public class Main {

	public static void main(String[] args) {

		SonataLowGrade sonataLowGrade = new SonataLowGrade("블루", "일반타이어", 2200, "파워핸들", 1000);
		sonataLowGrade.getSpec();

		SonataHighGrade sonataHighGrade = new SonataHighGrade("레드", "광폭타이어", 2200, "파워핸들", 1500);
		sonataHighGrade.getSpec();

	}
}
