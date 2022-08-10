import java.util.*;

public class Sum_Function {
    public static void Sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Sum(a, b);
    }
}
