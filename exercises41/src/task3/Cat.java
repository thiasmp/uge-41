package task3;

public class Cat extends Animal {
    public Cat(int numberOfLegs) {
        super(numberOfLegs);
    }


    @Override
    public void makeSound() {
        System.out.println("miaw");
    }
}
