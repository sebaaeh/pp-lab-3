package geometry;

public class zad5 {
    public static void main(String[] args) {
    
        Rectangle rectangle = new Rectangle(8.0, 5.0);
        
        System.out.println("Długość prostokąta: " + rectangle.getLength());
        System.out.println("Szerokość prostokąta: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}
