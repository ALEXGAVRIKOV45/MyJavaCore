package supportClasses;

import abstractClass.Animal;
import zooClasses.*;

import java.util.ArrayList;

import static supportClasses.AnimalStatus.HEBRIVORE;
import static supportClasses.AnimalStatus.PREDATOR;
import static supportClasses.AnimalType.*;

public class AppZoo {
    public static ArrayList<Animal> initAnimals() {
        ArrayList<Animal> arrAnimals = new ArrayList<Animal>();
        arrAnimals.add(new Wolf(WOLF,"Серый", 7, PREDATOR));
        arrAnimals.add(new Deer(DEER,"Олешка", 3, HEBRIVORE));
        arrAnimals.add(new Deer(DEER,"Рогатый", 4, HEBRIVORE));
        arrAnimals.add(new Giraffe(GIRAFFE,"Длинный", 5, HEBRIVORE));
        arrAnimals.add(new Wolf(WOLF,"Злой", 10, PREDATOR));
        arrAnimals.add(new Tiger(TIGER,"Царь саванны", 8, PREDATOR));
        arrAnimals.add(new Bear(BEAR,"Косолапый", 10, PREDATOR));
        arrAnimals.add(new Ostrich(OSTRICH,"Быстрый", 6, HEBRIVORE));

        return arrAnimals;
    }

    public static void  printZoo(ArrayList<Animal> arrAnimals) {
        arrAnimals.forEach(System.out::println);
    }

    public static void  voiceZoo(ArrayList<Animal> arrAnimals) {
        arrAnimals.forEach(animal -> {animal.getVoice();});
    }
}
