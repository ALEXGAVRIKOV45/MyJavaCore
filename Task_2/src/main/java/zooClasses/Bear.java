package zooClasses;

import abstractClass.Animal;
import supportClasses.AnimalStatus;
import supportClasses.AnimalType;

public class Bear extends Animal {
    public Bear(AnimalType type, String name, int age, AnimalStatus species) {
        super(type, name, age, species);
    }
    @Override
    public void getVoice() {
        System.out.println("Рев медведя");
    }
}
