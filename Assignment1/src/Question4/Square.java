package Question4;

public class Square {
    //Overriding example
    public void draw(int height) {
        System.out.println("This is child class draw function " + height);
    }
    public void erase() {
        System.out.println("This is child class erase function ");
    }

    public static void main(String[]args) {
        Square square=new Square();
        square.draw(23);
        square.erase();
    }
}
