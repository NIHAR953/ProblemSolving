package nihar_automation;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

//        // array is data structure which stores homogenous data/object
//        int arr[] = {10,20,30,40,50};
//        //System.out.println(arr.length); //5
//
////        for(int i=0;i<arr.length;i++)
////            System.out.println(arr[i]);
//
////        for (int i=arr.length-1;i>=0;i--)
////        {
////            System.out.println(arr[i]);
////        }
////
//        //50,10,20,30,40
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the value into array: ");
//        int[] arr1=new int[3]; //3
//
//        for(int i=0;i<arr.length;i++)
//        {
//            arr1[i] = sc.nextInt();
//        }
//
//        for(int i: arr1)
//            System.out.println(i);
//
//
//

        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();


        for(int k:arr)
            System.out.println(k);


    }
}
