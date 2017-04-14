import java.util.Scanner;
import java.util.Arrays;
public class homework_012 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int n1 = number.nextInt();

        System.out.println("Enter number 2: ");
        int n2 = number.nextInt();

        System.out.println("Enter number 3: ");
        int n3 = number.nextInt();

        System.out.println("Enter number 4: ");
        int n4 = number.nextInt();

        System.out.println("Enter number 5: ");
        int n5 = number.nextInt();

        System.out.println("Initial array: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);

        int[] intArr = {n1, n2, n3, n4, n5};
        Arrays.sort(intArr);
        System.out.println("Sorted array: " + Arrays.toString(intArr));
    }

}
