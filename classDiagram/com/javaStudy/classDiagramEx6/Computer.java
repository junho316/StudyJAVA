package com.javaStudy.classDiagramEx6;

public class Computer {

	private MainBoard mainBoard;
	private CPU cpu;
	private PowerSupply powerSupply;
	private Memory memory;

	public Computer() {
		mainBoard = new MainBoard();
		cpu = new CPU();
		powerSupply = new PowerSupply();
		memory = new Memory();
	}
}
