package day2;

import java.util.Scanner;

public class ReverseNoFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int rev=0, remainder=0;
        for(int i=0; num > 0;i++){
            remainder=num%10;
            rev=(rev*10)+remainder;
            num = num/10;
        }sc.close();
        System.out.println(rev);
    }
}
