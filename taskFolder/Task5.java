package taskFolder;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];

        System.out.println("Enter three numbers");
        System.out.println("Number 1: ");
        num[0] = scanner.nextInt();
        System.out.println("Number 2: ");
        num[1] = scanner.nextInt();
        System.out.println("Number 3: ");
        num[2] = scanner.nextInt();

        if (num[0] == num[1] && num[1] == num[2]){
            System.out.println("All numbers are equal.");
        }else{
            Arrays.sort(num);
            System.out.println("The Largest Number is: " + num[2]);
        }
        scanner.close();
    }
   
}