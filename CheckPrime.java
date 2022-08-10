import java.util.*;

public class CheckPrime {
    public static void isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("NOT Prime");
                break;
            } else {
                System.out.println("Prime");
            }
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);
    }
}
