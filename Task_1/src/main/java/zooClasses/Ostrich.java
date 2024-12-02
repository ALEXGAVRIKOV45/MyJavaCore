package zooClasses;

import abstractClass.Animal;
import supportClasses.AnimalStatus;
import supportClasses.AnimalType;

public class Ostrich extends Animal {
    public Ostrich(AnimalType type, String name, int age, AnimalStatus species) {
        super(type, name, age, species);
    }

    @Override
    public void getVoice() {
        System.out.println("Крик страуса");
    }
}
