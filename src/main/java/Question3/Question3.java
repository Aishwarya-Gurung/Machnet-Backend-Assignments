package Question3;

public class Question3 {
    public static void main(String[]args){
        //Area of rectangle
        Shape rectangle = (double length, double breadth) -> length * breadth;
        double rectangleArea = rectangle.calculateArea(2, 5);
        System.out.println("The area of rectangle is: " + rectangleArea);

        // Area of triangle
        Shape triangle = (double length, double breadth) -> 0.5*(length * breadth);
        double triangleArea = triangle.calculateArea(5, 5);
        System.out.println("The area of triangle is: " + triangleArea);

    }
}
