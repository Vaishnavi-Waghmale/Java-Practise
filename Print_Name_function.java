import java.util.*;

class Print_Name_function {

    public static void Myname(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Myname(name);
    }
}