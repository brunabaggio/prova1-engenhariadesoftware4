package br.edu.univas.design;

import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;

public class Invertebrados implements AbstractFactory{

	@Override
	public AnimalEat getAnimal(Animal animal) {
		if (animal.equals(Animal.BEE)) {
			return new Bee();
		} else if (animal.equals(Animal.ANT)) {
			return new Ant();
		}
		return null;
	}
	
}
