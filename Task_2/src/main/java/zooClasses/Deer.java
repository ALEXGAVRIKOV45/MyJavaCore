package zooClasses;

import abstractClass.Animal;
import supportClasses.AnimalStatus;
import supportClasses.AnimalType;

public class Deer extends Animal {
    public Deer(AnimalType deer, String name, int age, AnimalStatus species) {
        super(deer, name, age, species);
    }
    @Override
    public void getVoice() {
        System.out.println("Рев оленя");
    }
}
