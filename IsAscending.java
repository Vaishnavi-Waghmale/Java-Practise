import java.util.*;

public class IsAscending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num[] = new int[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        boolean check = true;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                check = false;
            }
        }

        if (check) {
            System.out.println("Array is in Ascending order");
        } else {
            System.out.println("Array is not in Ascending order");
        }
    }
}
