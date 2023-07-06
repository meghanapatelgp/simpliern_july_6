package first_project;
import java.util.ArrayList;
public class Main {
		    public static void main(String[] args) {
		        ArrayList<Geomteric_dimension> shapes = new ArrayList<>();

		        Square square = new Square(4);
		        shapes.add(square);
		        
		        Parellogram parellogram = new Parellogram(4.0,8.1);
		        shapes.add(parellogram);
		        
		        Trapezoid trapezoid = new Trapezoid(4.0,8.1,8.1);
		        shapes.add(trapezoid);
		        
		        Circle circle = new Circle(27.1);
		        shapes.add(circle);

		        Rectangle rectangle = new Rectangle(44, 22);
		        shapes.add(rectangle);

		        Triangle triangle = new Triangle(4.0, 8.0);
		        shapes.add(triangle);

		        try {
		            for (Geomteric_dimension shape : shapes) {
		                shape.displayArea();
		            }
		        } catch (Exception e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        } finally {
		            System.out.println("Area of square,parellogram,Trapezoid,circle,rectangle,triangle is calculated");
		        }
		    }
		}

