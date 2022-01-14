package com.ideas.interview;

import com.ideas.interview.model.BevarageType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;

	@Test
	public void dispenseBlackCoffeeForFree() {
		powerUp();
		assertEquals("Please select a coffee type", display.currentMessage());
		userWants(BevarageType.COFFEE);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(BevarageType.BLACK, barista.servedBevarage());
		assertEquals("Please collect your delicious coffee", display.currentMessage());
	}

	@Test
	public void dispenseBlackTeaForFree() {
		powerUp();
		assertEquals("Please select a beverage type", display.currentMessage());
		userWants(BevarageType.BLACK_TEA);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(BevarageType.BLACK_TEA, barista.servedBevarage());
		assertEquals("Please collect your delicious beverage", display.currentMessage());
	}

	private AcceptanceTest userWants(BevarageType bevarageType) {
		controller.userWants(bevarageType);
		return this;
	}

	private void powerUp() {
		display = new Display();
		barista = new Barista();
		controller = new Controller(display, barista);
	}
}
