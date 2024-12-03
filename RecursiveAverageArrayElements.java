import java.util.Scanner;

public class RecursiveAverageArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Average of " + array[i] + " = " + findAverage(array[i]));
        }
    }

    public static float findAverage(int num) {
        return (float) num / countDigits(num);
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}