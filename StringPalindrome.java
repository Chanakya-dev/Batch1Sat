import java.util.*;
public class StringPalindrome{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String :");
        String text=in.nextLine();
        String lowText=text.toLowerCase();
        String result=strPalindrome(lowText);
        System.out.println("Reversed String:"+result);
        int j=0;
    for(;j<text.length();j++){
        if(result.charAt(j)!=lowText.charAt(j)){
            System.out.println("Not a String palindrome");
            break;
        }
    }
    if(text.length()==j){
    System.out.println("Its a String Palindrome");
    }
    }
    public static String strPalindrome(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;

    }
}
