package com.ideas.interview;

import com.ideas.interview.model.BevarageType;

public class Barista {

	private BevarageType servedBevarage;

	public void serve(BevarageType bevarageType) {
		servedBevarage = bevarageType;
	}

	public BevarageType servedBevarage() {
		return servedBevarage;
	}

}
