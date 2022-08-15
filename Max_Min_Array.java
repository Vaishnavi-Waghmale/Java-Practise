import java.util.*;

public class Max_Min_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num[] = new int[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Largest Number from the array is " + max);
        System.out.println("Smallest Number from the array is " + min);
    }
}
