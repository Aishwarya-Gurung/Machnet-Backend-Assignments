package Question4;

public class Shape {
    //Overloading example
    public void draw() {
        System.out.println("There is no parameter in this function");
    }
    public void draw(int height) {
        System.out.println("There is parameter called height in this function" + height);
    }
    public void erase() {
        System.out.println("This is parent class erase function ");
    }
    public static void main(String[]args) {
        Shape obj =new Shape();
        obj.draw();
        obj.draw(2);
        obj.erase();
    }
}
