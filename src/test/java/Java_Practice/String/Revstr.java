package String;

import java.util.Scanner;

public class Revstr {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String A=sc.next();
        String b="";
        for(int i=A.length()-1;i>=0;i--){
            b=b+A.charAt(i);
        }
        System.out.println("reversed string:"+b);
    }
}