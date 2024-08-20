package zooClasses;

import abstractClass.Animal;
import supportClasses.AnimalStatus;
import supportClasses.AnimalType;

public class Wolf extends Animal {

    public Wolf(AnimalType wolf, String name, int age, AnimalStatus species) {
        super(wolf, name, age, species);
    }
}
