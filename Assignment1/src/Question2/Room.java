package Question2;

public class Room {
    int roomNo;
    String roomType;
    float roomArea;
    boolean acMachine;

    public void setData(int roomNo, String roomType, float roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType=roomType;
        this.roomArea=roomArea;
        this.acMachine=acMachine;

    }
    public void displayData() {
        System.out.println("The room no is: " + roomNo);
        System.out.println("The room type is: " + roomType);
        System.out.println("The room area is: " + roomArea);
        System.out.println("The room has acMachine: " + acMachine);
    }
    public static void main(String[]args) {
        Room obj = new Room();
        obj.setData(23, "delux", 25.2F, true);
        obj.displayData();
    }
}
