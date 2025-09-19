package taskFolder;
import static java.lang.Math.*;

public class Task9 {
    public static int add(int a, int b){
        return Math.addExact(a, b);
    }
    public static int subtract(int a, int b){
        return Math.subtractExact(a, b);
    }
    public static int multiply(int a, int b){
        return Math.multiplyExact(a, b);
    }
    public static float divide(int a, int b){
        return Math.floorDiv(a, b);
    }
    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println("Add: " + addExact(x, y));
        System.out.println("Subtract: " + subtractExact(x, y));
        System.out.println("Multiply: " + multiplyExact(x, y));
        System.out.println("Divide: " + floorDiv(x, y));
    }

}
