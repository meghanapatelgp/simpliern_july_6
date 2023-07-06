package first_project;
import java.util.ArrayList;
public class Geomteric_dimension {
		    public void displayArea() {
		        System.out.println("calculation of area starting ");
		    }
		}

class Square extends Geomteric_dimension {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public void displayArea() {
        double area = length*length;
        System.out.println("Area of the square dimension " + " "+area);
    }
}
class Trapezoid extends Geomteric_dimension {
    private double length1;
    private double length2;
    private double height;

    public Trapezoid(double length1,double length2,double height) {
        this.length1 = length1;
        this.length2 = length2;
        this.height = height;
    }

    public void displayArea() {
        double area = 0.5*(length1+length2)*height;
        System.out.println("Area of the Trapezoid dimension " + " "+area);
    }
}


class Parellogram extends Geomteric_dimension {
    private double base;
    private double verticle_height;
    public Parellogram(double base,double verticle_height) {
        this.base=base;
        this.verticle_height=verticle_height;
    }

    public void displayArea() {
        double area =base*verticle_height;
        System.out.println("Area of the parellogram dimension " + " "+area);
    }
}

		class Circle extends Geomteric_dimension {
		    private double radius;

		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    public void displayArea() {
		        double area = Math.PI * radius * radius;
		        System.out.println("Area of the circle dimension " + " "+area);
		    }
		}
		

		class Rectangle extends Geomteric_dimension {
		    private double length;
		    private double width;

		    public Rectangle(double length, double width) {
		        this.length = length;
		        this.width = width;
		    }

		    public void displayArea() {
		        double area = length * width;
		        System.out.println("Area of the Rectangle dimension" + " "+area);
		    }
		}

		class Triangle extends Geomteric_dimension {
		    private double base;
		    private double height;

		    public Triangle(double base, double height) {
		        this.base = base;
		        this.height = height;
		    }

		    public void displayArea() {
		        double area = 0.5 * base * height;
		        System.out.println("Area of the triangle dimention" +" "+ area);
		    }
		}

