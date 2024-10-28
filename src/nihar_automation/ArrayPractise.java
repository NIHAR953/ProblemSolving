package nihar_automation;

import java.util.Scanner;

public class ArrayPractise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value into array: ");
        int arr[]=new int[4];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for (int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
//        for (int k:arr)
//        {
//            System.out.println(k);
//        }
        //Q.1 Reverse an Array.

//        for (int i:arr){
//            System.out.println(i);
//        }
//        for (int j=arr.length-1;j>=0;j--){
//            System.out.print(arr[j]);
//        }
        //Q.2 Find the maximum value in array.

//        int max=arr[0];
//        for (int i=1;i<arr.length;i++)
//        {
//            if (arr[i]>max){
//                max=arr[i];
//                System.out.println(max);
//            }
//        }




    }
}
