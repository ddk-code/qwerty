import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

    public static void print(String strArg, int val) {
        System.out.println("print(\"" + strArg + "\", " + val + ")");
    }

    // write your method here

    /* Do not change code below */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int val = scanner.nextInt();
//        print(str);
//        print(str, val);
        int[] a = {4, 0, 9, 2, 1};
        int[] b = {6, 3, 2, 9, 0};
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] -= b[i];
            } else {
                b[i] -= a[i];
            }
        }


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}