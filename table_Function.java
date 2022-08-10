import java.util.*;

public class table_Function {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int ans;
            ans = n * i;
            System.out.println(ans);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printTable(n);
    }
}
