package task3;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> listOfAnimals;

    public Zoo()    {
        this.listOfAnimals = new ArrayList<>();
    }

    public void makeAllSounds() {
        for (Animal animal: this.listOfAnimals) {
            animal.makeSound();
        }
    }

    public void addAnimal(Animal animal) {
        this.listOfAnimals.add(animal);

    }
    public void printNumberOfLegs() {
        int sum =0;
        for (Animal animal: this.listOfAnimals
             ) {
            sum+= animal.getNumberOfLegs();

        }
        System.out.println(sum);
    }



        }

