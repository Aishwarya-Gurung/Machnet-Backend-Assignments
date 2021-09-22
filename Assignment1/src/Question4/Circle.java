package Question4;

public class Circle {
    //Overriding example
    public void draw() {
        System.out.println("This is child class draw function ");
    }
    public void erase() {
        System.out.println("This is child class erase function ");
    }

    public static void main(String[]args) {
        Circle circle=new Circle();
        circle.draw();
        circle.erase();
    }
}
