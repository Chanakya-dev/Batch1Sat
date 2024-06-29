package Batch1Sat;
import java.util.Scanner;

public class StrRev  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String rev = " ";

        String[] words = str.split(" ");

        for(int i = words.length-1;i>=0;i--){
            rev+=words[i]+" ";
        }
        sc.close();

        System.out.println(rev);
    }
}
