package com.ideas.interview;

import com.ideas.interview.model.BevarageType;

public class Controller {
	private final Display display;
	private final Barista barista;
	private BevarageType bevarageType;

	public Controller(Display display, Barista barista) {
		this.display = display;
		this.barista = barista;
		display.show("Please select a beverage type");
	}

	public void userWants(BevarageType bevarageType) {
		this.bevarageType = bevarageType;
		display.show("Great Choice!");
	}

	public void dispense() {
		barista.serve(bevarageType);
		display.show("Please collect your delicious beverage");
	}
}
