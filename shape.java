import java.util.*;


abstract class Shape {

int a, b;

Shape(int x, int y) {
    a = x;
    b = y;
	}

abstract void Printarea();
	}

class Circle extends Shape {

    Circle(int a, int b) {
        super(a, b);
    }

    void Printarea() {
        System.out.println("area of circle is " + (3.14 * a * a));
    }

}

class Rectangle extends Shape {
  Rectangle(int a, int b) {
    super(a, b);
}

void Printarea()
{
    System.out.println("area of rectangle is " + (a * b));
}

}

class Triangle extends Shape {
public Triangle(int a, int b) {
    super(a, b);
}

void Printarea()

{

    System.out.println("area of triangle is " + (0.5 * a * b));

}

}

class Main {
public static void main(String args[]) {

	Scanner in = new Scanner(System.in);

	System.out.println("Enter dimension 1: ");
	int x = in.nextInt();
	System.out.println("Enter dimension 2: ");
	int y = in.nextInt();


    Shape b;
    b = new Circle(x, y);
    b.Printarea();
    
    b = new Rectangle(x, y);
    b.Printarea();

    b = new Triangle(x, y);
    b.Printarea();
}
}