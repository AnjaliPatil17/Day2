package day2;
//using for loop
import java.util.Scanner;

public class SumNaturaNoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int num= sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
           sum=sum+i;
        }sc.close();
        System.out.print("Sum of natural number is " + sum);
    }
}
