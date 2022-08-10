import java.util.*;

public class Greater {
    public static void printGreater(int a, int b) {
        if (a > b) {
            System.out.print(a);
        } else if (b > a) {
            System.out.print(b);
        } else {
            System.out.print("Equal numbers");
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printGreater(a, b);

    }
}
