package task3;

public class Animal implements AnimalSound  {
    private final int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    @Override
    public void makeSound()   {
        System.out.println("undefinded animals make no sound");



    }

}
