import abstractClass.Animal;
import zooClasses.Deer;
import zooClasses.Wolf;

import static supportClasses.AnimalStatus.HEBRIVORE;
import static supportClasses.AnimalStatus.PREDATOR;

public class MyZoo {
    public static void main(String[] args) {
        Animal wolf1 = new Wolf("Серый", 7, PREDATOR);
        Animal deer1 = new Deer("Олешка",3,HEBRIVORE);
    }

}
