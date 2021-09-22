package br.edu.univas.design;

import static br.edu.univas.design.AnimalType.INVERTEBRADO;
import static br.edu.univas.design.AnimalType.VERTEBRADO;

public class AnimalProvider {
	public static AbstractFactory getAnimalType(AnimalType animalType) {
		if (animalType.equals(INVERTEBRADO)) {
			return new Invertebrados();
		} else if (animalType.equals(VERTEBRADO)) {
			return new Vertebrados();
		}
		return null;
	}
}
