package com.javaStudy.nestedClassEx2;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();

		button.setOnclickListener(new MessageListener());
		button.touch();

		button.setOnclickListener(new CallListener());
		button.touch();
	}

}
