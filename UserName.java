import java.util.*;

public class UserName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String Username = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                Username += email.charAt(i);
            }
        }
        System.out.println(Username);
    }
}
