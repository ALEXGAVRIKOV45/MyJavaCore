package abstractClass;

import supportClasses.AnimalStatus;

public abstract class Animal {
    private String name;
    private int age;
    private AnimalStatus species;

    public void getVoice() {

    }

    public Animal(String name, int age, AnimalStatus species) {
        this.name = name;
        this.age = age;
        this.species = species;
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
