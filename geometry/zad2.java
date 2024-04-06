package geometry;

public class zad2 {
    public static void main(String[] args) {
        Point center = new Point(5.0, 7.0);
        Circle circle = new Circle(center, 12.0);
        
        System.out.println("Współrzędne środka koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}
