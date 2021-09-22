package br.edu.univas.vo;

import br.edu.univas.design.AnimalEat;

public class Shark implements AnimalEat{

	@Override
	public void eat() {
		System.out.println("shark eating");
	}

	
}
