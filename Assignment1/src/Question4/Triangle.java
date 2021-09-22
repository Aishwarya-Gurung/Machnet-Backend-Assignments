package Question4;

public class Triangle {
    //Overriding example
    public void draw() {
        System.out.println("This is child class draw function ");
    }
    public void erase() {
        System.out.println("This is child class erase function ");
    }

    public static void main(String[]args) {
        Triangle triangle=new Triangle();
        triangle.draw();
        triangle.erase();
    }
}
