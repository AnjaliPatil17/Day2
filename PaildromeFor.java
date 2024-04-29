package day2;

import java.util.Scanner;

public class PaildromeFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no: ");
        int num=sc.nextInt();
        int remainder=0,reverse=0;
        int temp=num;
        for(int i=0;temp > 0;i++){
            remainder=temp%10;
            reverse=(reverse*10)+remainder;
            temp=temp/10;
        }
        if(num==reverse){
            System.out.println("Its a paildrome number");
        }else{
            System.out.println("Its not a paildrome number");
        }sc.close();
    }
}
