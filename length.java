import java.util.*;

public class Length {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        int totlength = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
            totlength = arr[i].length();
            System.out.println(totlength);
        }

    }
}

