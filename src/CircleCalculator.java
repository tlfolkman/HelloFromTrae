package jacobterrell;
import java.util.Scanner;

public class CircleCalculator {
    private static Scanner scanner = new Scanner( System.in );

    private double getRadius(){
        double radius = 0;

        while (radius < 0) {
            System.out.println("Enter circle radius: ");
            String input = scanner.nextLine();
            radius = Integer.parseInt(input);
        }
        return radius;
    }

    private void displayCircumference(double radius){
        double circ = Math.PI * radius * 2;
        System.out.format("\tcircle Circumference: %,.2f%n", circ);
    }

    public void displayArea(double radius){
        double area = Math.PI * radius * radius;
        System.out.format("\tcircle Area: %,.2f%n", area);
    }

    public static void main(String[] args) {
	// write your code
        CircleCalculator calc = new CircleCalculator();

        double r = calc.getRadius();
        calc.displayArea(r);
        calc.displayCircumference(r);
    }
}
