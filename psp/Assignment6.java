
    import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.calculateArea());
        sc.close();
}
}

