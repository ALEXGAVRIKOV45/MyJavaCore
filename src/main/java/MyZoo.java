import abstractClass.Animal;
import java.util.ArrayList;

import static supportClasses.AppZoo.*;

public class MyZoo {
    public static void main(String[] args) {
        ArrayList<Animal> myZoo = initAnimals();
        printZoo(myZoo);
        voiceZoo(myZoo);
    }

}
