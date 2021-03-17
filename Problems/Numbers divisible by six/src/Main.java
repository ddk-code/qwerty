import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int temp = scanner.nextInt();
            if (temp % 6 == 0) {
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}