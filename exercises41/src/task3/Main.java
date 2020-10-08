package task3;

public class Main {
    public static void main(String[] args){
    Animal dog  = new Dog(4);
    Animal cat = new Cat(4);
    Animal fish = new Fish(0);

    Zoo zoo = new Zoo();
    zoo.addAnimal(dog);
    zoo.addAnimal(cat);
    zoo.addAnimal(fish);
    zoo.printNumberOfLegs();
    zoo.makeAllSounds();



    }
}
