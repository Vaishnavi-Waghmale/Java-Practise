import java.util.*;

public class Product_Function {
    public static int calcProduct(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Product = calcProduct(a, b);
        System.out.print(Product);
    }
}
