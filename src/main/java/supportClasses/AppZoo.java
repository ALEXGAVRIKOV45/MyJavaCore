package supportClasses;

import abstractClass.Animal;
import zooClasses.Deer;
import zooClasses.Wolf;

import java.util.ArrayList;

import static supportClasses.AnimalStatus.HEBRIVORE;
import static supportClasses.AnimalStatus.PREDATOR;
import static supportClasses.AnimalType.DEER;
import static supportClasses.AnimalType.WOLF;

public class AppZoo {
    public static ArrayList<Animal> addAnimals() {
        ArrayList<Animal> arrAnimals = new ArrayList<Animal>();
        arrAnimals.add(new Wolf(WOLF,"Серый", 7, PREDATOR));
        arrAnimals.add(new Deer(DEER,"Олешка", 3, HEBRIVORE));
        return arrAnimals;
    }

    public static void  printZoo(ArrayList<Animal> arrAnimals) {
        arrAnimals.forEach(System.out::println);
    }
}
