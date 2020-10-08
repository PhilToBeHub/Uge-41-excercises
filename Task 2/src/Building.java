// 2.d
public class Building {
    public final int Rooms = 3;
    public int numberOfBathrooms;
    public int numberOfFloors;
    public boolean isOfficeBuilding;

    // 2.e
    Building(int Rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;

    }

    // 2.f
    public int getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean getIsOfficeBuilding() {
        return true;
    }

    public void setIsOfficeBuilding(boolean isOfficeBuilding) {
        this.isOfficeBuilding = isOfficeBuilding;
    }
}

