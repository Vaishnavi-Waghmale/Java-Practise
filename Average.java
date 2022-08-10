import java.util.*;

public class Average {
    public static void calcAverage(int a, int b, int c) {
        int ans = (a + b + c) / 3;

        System.out.println(ans);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calcAverage(a, b, c);
    }
}
