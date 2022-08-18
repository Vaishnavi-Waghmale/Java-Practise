public class string {
    public static void main(String args[]) {
        // concatenation
        String firstName = "Vaishnavi";
        String lastName = "Waghmale";
        String fullName = firstName + lastName;
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
