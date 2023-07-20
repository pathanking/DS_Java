package com.srkr.assignments;

public abstract class Smartphone {
	String model;
	int ram;

	Smartphone(String model, int ram) {
		this.model = model;
		this.ram = ram;
	}

	abstract void call();
}

class OnePlus extends Smartphone implements FiveG{
	boolean sensor;

	OnePlus(String model, int ram, boolean sensor) {
		super(model, ram);
		this.sensor = sensor;
	}

	@Override
	void call() {
		System.out.println("Calling using " + getClass().getSimpleName());
		enable5G();
	}

	@Override
	public void enable5G() {
		System.out.println("5G Enabled");
	}
}
