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

        int result=Sumpair(array, 20);
        if (result==-1) {
            System.out.println("No pair found with sum " + target);
        }

        input.close();
    }
public static int SumPair(int[] array, this.target){
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    
                   return    (numbers[i] ,numbers[j] );
                    
                    
                }
            }
        }
        return -1;
    }
    


}
