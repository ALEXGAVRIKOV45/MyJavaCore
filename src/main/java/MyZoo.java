import abstractClass.Animal;
import java.util.ArrayList;

import static supportClasses.AppZoo.*;

public class MyZoo {
    public static void main(String[] args) {
        ArrayList<Animal> myZoo = initAnimals();
        System.out.println("-----Общий список-----");
        printZoo(myZoo);
        System.out.println("\n-----Голоса зверей-----");
        voiceZoo(myZoo);
        ArrayList<Animal> myZooPredators = predatorsZoo(myZoo);
        System.out.println("\n-----Список хищников-----");
        printZoo(myZooPredators);
        System.out.println("\n-----Продали волков-----");
        sellAnimal("Серый", myZoo);
        sellAnimal("Злой", myZoo);
        printZoo(myZoo);

    }

}
