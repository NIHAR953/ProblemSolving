package nihar_automation;

import java.util.Scanner;

public class AutoSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Browser Name : ");
        String browser_name=sc.next();
        switch (browser_name){
            case"chrome":
                System.out.println("Chrome is Lunched. ");
                break;
            case "firefox":
                System.out.println("Firefox is lunched. ");
                break;
            case"safari":
                System.out.println("Safari browser is lunched. ");
                break;
            case "opera":
                System.out.println("Opera Browser is lunched. ");
                break;
            case "edge":
                System.out.println("Edge Browser is lunched");
                break;
            default:
                System.out.println("Invalid browser name entered.");
        }
        System.out.println("Nihar");

    }
}
