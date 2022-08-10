import java.util.*;

public class CheckEven {
    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isEven(n);
    }
}
