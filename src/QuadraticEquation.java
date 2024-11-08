import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Enter b: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Enter c:");
        double c = new Scanner(System.in).nextDouble();

        Equation equation = new Equation();
//        double delta = equation.getDiscriminant();
        double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            double root1 = ((-b - Math.sqrt(delta)) / (2 * a));
            double root2 = ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("2 distinct solutions: x1 = :" + root1 + " x2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Solution: " + root);
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
