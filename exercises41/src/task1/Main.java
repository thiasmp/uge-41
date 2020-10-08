package task1;

public class Main {

    public static void main(String[] args)  {
        Driver driver1 = new Driver("Thias Petersen",22);
        Car car = new Car("Volkswagen", "Golf V", 2003,"Compact");
        Car car2 = new Car("Skoda", "Fabia",2018,"compact");
        car.getDriver();
        car2.getDriver();



        System.out.println(car.toString()+driver1.toString());
        System.out.println(car2.toString()+driver1.toString());

    }
}