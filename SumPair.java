import java.util.Scanner;

public class SumPairFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(
                        "Pair found: " + numbers[i] + " + " + numbers[j] + " = " + target
                    );
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found with sum " + target);
        }

        input.close();
    }
}
