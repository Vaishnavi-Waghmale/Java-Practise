import java.util.*;

public class Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int res1 = 0;
        int res2 = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();

            if (a > 0) {
                res++;
            } else if (a == 0) {
                res1++;
            } else if (a < 0) {
                res2++;
            }

        }
        System.out.println("Positive numbers are : " + res);
        System.out.println("Zeros are : " + res1);
        System.out.println("Negative numbers are : " + res2);

    }
}
