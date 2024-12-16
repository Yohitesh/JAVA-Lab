import java.util.Scanner;
public class QE{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = scan.nextFloat();
        System.out.println("Enter the 2nd number:");
        double b = scan.nextFloat();
        System.out.println("Enter the 3rd number:");
        double c = scan.nextFloat();
        double d = (b * b) - (4 * a * c);
        if (a == 0) {
            System.out.println("Root doesn't exist");
        } else {
            if (d > 0) {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Roots are real and distinct");
                System.out.println("Root 1 = " + r1 + " and Root 2 = " + r2);
            } else if (d == 0) {
                double r0 = (-b) / (2 * a);
                System.out.println("The roots are real and equal");
                System.out.println("Root 1 = Root 2 = " + r0);
            } else {
                double real = (-b) / (2 * a);
                double img = (Math.sqrt(-d)) / (2 * a);
                System.out.println("The Roots are Imaginary");
                System.out.println("The real root is " + real + " and the imaginary root is " + img);
                System.out.println("1BM23CS085, Dama Yohitesh Naveen Sai");
            }
        }
        scan.close();
    }
}













