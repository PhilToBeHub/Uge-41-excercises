// 2.a
public class Room {
    public int Walls;
    public int numberOfDoors;
    public int numberOfLamps;
    public int numberOfWindows;

    // 2.b
    Room( int Walls,  int numberOfDoors,  int numberOfLamps,  int numberOfWindows) {
        this.Walls = Walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }

    // 2.c
    public int getWalls() {
        return Walls;
    }

    public void setWalls(int walls) {
        Walls = walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}