package day2;

import java.util.Scanner;

public class NumberPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num==1){
            System.out.println(" Unit");
        } else if (num == 10) {
            System.out.println(" Ten");
        } else if (num == 100) {
            System.out.println(" Hundred");
        } else if (num == 1000) {
            System.out.println(" Thousand");
        }else{
            System.out.println("Invalid input");
        }sc.close();
    }
}
