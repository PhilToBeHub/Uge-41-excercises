import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 2.g
        Room room1 = new Room(4,2,3,6);
        Room room2 = new Room(8,3,5,8);
        Room room3 = new Room(12,2,8,13);

        // 2.h
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 2.i
        Building building = new Building(56,12,4,true);

        // 2.j
        int sum = 0;
        for (int i = 0; i < rooms.size(); i++) {
            //sum = sum + rooms[i].getNumberOfLamps();
        }
        room1.getNumberOfLamps();


        // 2.k
        //building.setNumberOfFloors(4);
        System.out.println(building.getNumberOfFloors());

        if (building.getNumberOfFloors() > building.getRooms()) {
            System.out.println("This is an odd building");
        }
    }
}

/*
2.a Create a Room.java class with the following fields (use appropriate types):

Walls
numberOfDoors
numberOfLamps
numberOfWindows
2.b Create a constructor that populates all the fields above.
2.c Create getters() for each of the fields above.
2.d Create a Building.java class with the following fields (use appropriate types):

Rooms (make sure to use the 'final' keyword here).
numberOfBathrooms
numberOfFloors
isOfficeBuilding

2.e Create a constructor that populates all the fields above.
2.f Create getters() for each of the fields above.

2.g In your main method, instantiate at least three different rooms.
2.h Add the three rooms to a collection (preferably of the same data type used for the "Rooms" field in your Building.java class).
2.i In your main method, instantiate a new building.

2.j print the total number of lamps in the entire building.
2.k make an if statement that checks if numberOfFloors > number of Rooms. if true, then print "This is an odd building".
 */