import java.util.Scanner;
public class homework_012 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner number = new Scanner(System.in);

        for (int b = 0; b < a.length; b++) {
            System.out.print("Enter number " + (b + 1) + ":\n");
            a[b] = number.nextInt();
        }
        System.out.print("Initial array: ");

        for ( int b = 0; b < a.length; b++) {
            System.out.print(a[b] + " ");
        }
        System.out.println();
        System.out.print("Sorted array: ");

        for (int j = 1; j <= a.length - 1; j++) {
            int num = a[j];

            for (int i = j - 1; i >= 0 && a[i] > num; i--) {
                a[i + 1] = a[i];
                a[i] = num;
            }
        }
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }
}
