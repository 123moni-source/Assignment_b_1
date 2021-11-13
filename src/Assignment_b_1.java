import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment_b_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of the elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
                System.out.println("Enter the index of the element you want to access");
                int index = sc.nextInt();

                System.out.println("The element at" + index + "is " + arr[index]);
                System.out.println("The array element found");

        }
            catch(ArrayIndexOutOfBoundsException p)
            {
                System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            }
            catch( InputMismatchException p)
            {
                System.out.println("java.util.InputMismatchException");
            }
            sc.close();
        }

}
