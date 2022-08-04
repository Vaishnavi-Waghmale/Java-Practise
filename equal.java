import java.util.*;

public class equal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a < b) {
            System.out.println("B is greater than A");
        } else if (a > b) {
            System.out.println("A is greater than B");
        }
    }
}
