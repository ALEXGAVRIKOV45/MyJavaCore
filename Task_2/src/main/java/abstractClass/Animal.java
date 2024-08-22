package abstractClass;

import supportClasses.AnimalStatus;
import supportClasses.AnimalType;

public abstract class Animal {
    private AnimalType type;
    private String name;
    private int age;
    private AnimalStatus species;

    public void getVoice() {

    }

    public Animal(AnimalType type, String name, int age, AnimalStatus species) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public String toString() {
        return "У нас есть: "+ this.type.getType() + " { Кличка = " + this.name + ", возраст = " + this.age + ", статус = " + this.species.getStatus() + "}";
    }

    public AnimalStatus getSpecies() {
        return species;
    }

    public void setSpecies(AnimalStatus species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
