package day2;

import java.util.Scanner;

public class ReverseNumWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int reverse=0,remainder=0;
        while(num>0){
            remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;
        }sc.close();
        System.out.println(reverse);
    }
}
