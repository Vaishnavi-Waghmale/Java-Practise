import java.util.*;

public class Circumference {
    public static void calcCircum(int r) {
        double ans = 2 * 3.14 * r;
        System.out.println(ans);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        calcCircum(r);
    }
}
