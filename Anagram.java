package Batch1Sat;

import java.util.Scanner;

public class Anagram{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String s1=sc.next();

        System.out.println("Enter the second string");
        String s2=sc.next();

        if(s1.length() != s2.length()){
            System.out.println("Not a anagram because length is not same");
        }

        
        else {

            int i=0;
            for( ;i<s1.length();i++){

                if(!s1.contains(""+s2.charAt(i)) || !s2.contains(""+s1.charAt(i))){
                    break;
                }
            }

            if(i==s1.length()){
                System.out.println("It is an anagram");
            }
            else{
                System.out.println("It is not anagram");
            }
        }

    }

}