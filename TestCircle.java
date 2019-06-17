
import java.text.DecimalFormat;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.print("The radius for circle 1 is: " + new DecimalFormat("0.00").format(circle1.radius) + " and ");
        System.out.println("the area for circle 1 is: " + new DecimalFormat("0.00").format(circle1.getArea()));

        Circle circle2 = new Circle(5);
        System.out.print("The radius for circle 2 is: " + new DecimalFormat("0.00").format(circle2.radius) + " and ");
        System.out.println("the area for circle 2 is: " + new DecimalFormat("0.00").format(circle2.getArea()));

        Circle circle3 = new Circle(25);
        System.out.print("The radius for circle 3 is: " + new DecimalFormat("0.00").format(circle3.radius) + " and ");
        System.out.println("the area for circle 3 is: " + new DecimalFormat("0.00").format(circle3.getArea()));

    }

}
