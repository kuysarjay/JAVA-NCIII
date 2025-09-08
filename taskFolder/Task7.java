package taskFolder;

import java.util.Scanner;

public class Task7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the Second Number: ");
        double num2 = scanner.nextDouble();

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double qoutient = divide(num1, num2);

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Qoutient: "+qoutient);

        scanner.close();
    }
    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if(b==0){
            System.out.println("Error: Cannot divide by 0.");
            return Double.NaN; // Not-a-Number
        }
        return a/b;
    }
}