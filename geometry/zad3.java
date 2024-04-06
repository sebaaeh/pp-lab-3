package geometry;

public class zad3 {
    public static void main(String[] args) {
   
        Point center = new Point(5.0, 7.0);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 12.0, "blue");
        
        System.out.println("Współrzędne środka koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}
