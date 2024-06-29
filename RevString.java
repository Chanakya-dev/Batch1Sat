import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            String s = ob.nextLine();
            int n = s.length();
            String rev = "";
            for (int i = n - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            System.out.println(rev);
        }
    }
}
