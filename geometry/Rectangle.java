package geometry;

// Klasa Rectangle reprezentująca prostokąt
public class Rectangle {
    // Prywatne pola length i width reprezentujące długość i szerokość prostokąta
    private double length;
    private double width;

    // Konstruktor inicjujący pola length i width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Metoda calculateArea zwracająca pole prostokąta
    public double calculateArea() {
        return length * width;
    }

    // Metoda calculatePerimeter zwracająca obwód prostokąta
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getter dla długości prostokąta
    public double getLength() {
        return length;
    }

    // Getter dla szerokości prostokąta
    public double getWidth() {
        return width;
    }
}
