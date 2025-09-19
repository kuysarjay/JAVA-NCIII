package taskFolder;

public class Task8 {
    public static int processNumber(int... numbers) {
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++){
            int currentNumber = numbers[i];
            totalSum += currentNumber;

            int cumulativeSum = 0;
            for (int j = 1; j <= currentNumber; j++){
                cumulativeSum += j;
            }
            System.out.println("Cumulative Sum up to " + currentNumber + " is: " + cumulativeSum);
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int sum = processNumber(4, 5, 10);
        System.out.println("Total sum of all numbers is:" + sum);
    }
}
