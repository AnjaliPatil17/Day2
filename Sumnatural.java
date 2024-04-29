package day2;

import java.util.Scanner;

public class Sumnatural {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no: ");
        int num= sc.nextInt();

        int i=0;
        int sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }sc.close();
        System.out.print("Sum of natural number is "+sum);
    }
}
