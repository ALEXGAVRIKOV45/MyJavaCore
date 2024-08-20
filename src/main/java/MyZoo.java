import abstractClass.Animal;
import java.util.ArrayList;
import static supportClasses.AppZoo.addAnimals;
import static supportClasses.AppZoo.printZoo;

public class MyZoo {
    public static void main(String[] args) {
        ArrayList<Animal> myZoo = addAnimals();
        printZoo(myZoo);
    }

}
