package solid;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(2);
        rectangle.setWidth(5);
        System.out.println(rectangle.getArea());

        Square square = new Square(12);
        System.out.println(square.getArea());
    }
}
