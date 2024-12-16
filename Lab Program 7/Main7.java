interface Polygon {

   
    default double getPerimeter() {
           return 0.0;
    }

    
    double getArea();  
}

class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width; 
    }


    @Override
    public double getPerimeter() {
        return 2 * (length + width); 
    }
}

class Circle implements Polygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
    }

      @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;     }
}

public class Main7 {
    public static void main(String[] args) {
        System.out.print("1BM23CS085, Dama Yohitesh Naveen Sai\n");

        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());        
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter()); 
        
        Circle circle = new Circle(4);
        System.out.println("Circle Area: " + circle.getArea());            
        System.out.println("Circle Perimeter: " + circle.getPerimeter());  
    }
}