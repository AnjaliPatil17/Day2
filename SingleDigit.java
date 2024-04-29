package day2;

import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int number = sc.nextInt();
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (number >= 0 && number <=9){
            System.out.println(arr[number]);
        }else{
            System.out.println("Not a single digit");
        }sc.close();
    }
}
