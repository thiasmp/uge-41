package task2;

public class Main {
    public static void main(String[] args)  {
    Room room = new Room(4,2,5,4);
    Room room2 = new Room(4,1,8,1);
    Room room3 = new Room(4,4,5,3);
    Building building = new Building(3,1,1,false);

    building.getList().add(room);
    building.getList().add(room2);
    building.getList().add(room3);


        int sum = room.getNumberOfLamps()+ room2.getNumberOfLamps()+ room3.getNumberOfLamps();
        System.out.println("number of lamps " +sum);

        if (building.getNumberOfFloors() > building.getRooms())
        {
            System.out.println("This is a an odd building");
        }





    }
}
