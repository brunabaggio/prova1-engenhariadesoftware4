package br.edu.univas.design;

import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class Vertebrados implements AbstractFactory{

	@Override
	public AnimalEat getAnimal(Animal animal) {
		if (animal.equals(Animal.ELEPHANT)) {
			return new Elephant();
		} else if (animal.equals(Animal.SHARK)) {
			return new Shark();
		}
		return null;
	}
	
}
