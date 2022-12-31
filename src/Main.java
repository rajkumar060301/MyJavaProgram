import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {45,78,96,78,35,56};
        int num = sc.nextInt();
        System.out.println(fibonacci(num));

    }

}
