import java.util.*;

public class Eligibility {
    public static void canVote(int age) {
        if (age >= 18) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        canVote(age);
    }
}
