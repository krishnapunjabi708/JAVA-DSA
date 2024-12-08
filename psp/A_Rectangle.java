class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }
}

class Box extends Rectangle {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    double getSurfaceArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }
}

public class A_Rectangle{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Box box = new Box(5, 10, 3);
        System.out.println("Box Volume: " + box.getVolume());
        System.out.println("Box Surface Area: " + box.getSurfaceArea());
    }
}
