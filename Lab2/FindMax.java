
import java.util.Scanner;
 
public class FindMax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

   
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
     int resul= MaxNum(numbers);
public static void MaxNum(int[] numbers){
        int highest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        System.out.println("The highest number in the array is: " + highest);

        input.close();
}
    }
}

