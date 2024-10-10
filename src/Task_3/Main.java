package Task_3;

import java.util.ArrayList;
// 3.g Create a class Main with a main-method. In your main-method, instantiate at least three different rooms.
public class Main {
    public static void main(String[] args) {

        // instantiating rooms
        Room room1 = new Room(3, 2);
        Room room2 = new Room(2, 4);
        Room room3 = new Room(6, 8);

        // 3.h Add the three rooms to a collection
        // making a list and a collection
        ArrayList<Room> roomList = new ArrayList<Room>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);


        //3.i In your main-method, instantiate a new building with the rooms you created in 3.h.
        Building building = new Building(roomList, 3);

        // the use of the countLampsInBuilding method
        System.out.println("The total number of lamps: " + countLampsInBuilding(building));
        System.out.println("The total of Number of windows: " + countWindowInBuilding(building));
        System.out.println("The total numbers of rooms: " + countRoomsInBuilding(building));
        System.out.println("I the number of floors greater than or equal to the number of rooms? " + isNormal(building));
    }
    //3.j Create a static method in Main called countLampsInBuilding() that takes an object of type Building and returns the total number of lamps in the entire building.
    // the total amount of lamps in a build in a method
    private static int countLampsInBuilding(Building building) {
        int sumOfLamps = 0;
        for (Room room : building.getRooms()) {
            sumOfLamps += room.getNumberOfLamps();
        }
        return sumOfLamps;
    }
    //Create methods countWindowsInBuilding() and countRoomsInBuilding().
    // The total amount of windows in a build in a method
    public static int countWindowInBuilding(Building building) {
        int sumOfWindows = 0;
        for (Room room : building.getRooms()) {
            sumOfWindows += room.getNumberOfWindows();
        }
        return sumOfWindows;
    }

    // the total amount of rooms in buildings , build in a method
    public static int countRoomsInBuilding(Building building) {
        int sumOfRooms = 0;
        for (Room rooms : building.getRooms()) {
            sumOfRooms += building.getRooms().size();
        }
        return sumOfRooms;
    }
    /* 3.k create another static method in Main called isNormal()
    that takes an object of type Building as argument.
    The method should return true if the building's number of
    floors is greater than or equal to it's number of rooms
     */
    private static boolean isNormal(Building building){
        if(building.getNumberOfFloors() >= building.getRooms().size()){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }
}
