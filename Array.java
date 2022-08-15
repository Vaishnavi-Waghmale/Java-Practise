import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String names[] = new String[a];
        for (int i = 0; i < a; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
