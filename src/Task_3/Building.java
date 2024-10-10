package Task_3;

import java.util.ArrayList;
//3.d Create a class Building with the following fields rooms/numberOfFloors
public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    //3.e Create a constructor that populates all the fields.
    public Building(ArrayList<Room> rooms,int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // 3.f As the fields of Building are private, create getters and setters for them.
    public ArrayList<Room> getRooms(){;
        return rooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public void setRooms(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

}
