package nihar_automation;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        boolean result=isPallindrome(num);
        if (result==true){
            System.out.println("It is a pallindrome Number.");
        }else {
            System.out.println("It is not a pallindrome Number.");
        }
    }
    public static boolean isPallindrome(int num){
        int breverse=num;
        int areverse=0;
        int rem=0;
        while (num>0){
            rem=num%10;
            areverse=(areverse*10)+rem;
            num=num/10;
        }
        return breverse==areverse;
    }
}
