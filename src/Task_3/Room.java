package Task_3;
// 3.a Create a class Room with the following attributes/fields numbersOfLamps/numberOfWindows
public class Room {
    private int numberOfLamps;
    private int numberOfWindows;
    //3.b Create a constructor that populates (assigns values to) all the fields.
    public Room(int numberOfLamps,int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //3.c As the fields of Room are private, create getter- and setter-methods for them.
    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps ){
        this.numberOfLamps = numberOfLamps;

    }

    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }
}
