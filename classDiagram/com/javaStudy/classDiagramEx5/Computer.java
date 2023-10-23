package com.javaStudy.classDiagramEx5;

public class Computer {

	private MainBoard mainBoard;
	private CPU cpu;
	private PowerSupply powerSupply;
	private Memory memory;

	public Computer(MainBoard mainBoard, CPU cpu, PowerSupply powerSupply, Memory memory) {
		this.mainBoard = mainBoard;
		this.cpu = cpu;
		this.powerSupply = powerSupply;
		this.memory = memory;
	}
}
