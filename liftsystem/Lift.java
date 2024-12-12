package thirdround.liftsystem;

public class Lift {
    String name;
    int capacity;
    int currentPosition;

    public Lift(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
