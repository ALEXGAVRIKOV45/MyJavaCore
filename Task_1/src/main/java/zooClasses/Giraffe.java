package zooClasses;

import abstractClass.Animal;
import supportClasses.AnimalStatus;
import supportClasses.AnimalType;

public class Giraffe extends Animal {
    public Giraffe(AnimalType type, String name, int age, AnimalStatus species) {
        super(type, name, age, species);
    }
    @Override
    public void getVoice() {
        System.out.println("Голос жирафа");
    }
}
