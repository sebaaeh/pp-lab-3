package geometry;

public class zad4 {
    public static void main(String[] args) {

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 4);
        circles[1] = new ColoredCircle(new Point(1, 2), 5, "red");
        circles[2] = new Circle(new Point(3, 3), 6);

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole powierzchni koła: " + area);
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                String color = coloredCircle.getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}
