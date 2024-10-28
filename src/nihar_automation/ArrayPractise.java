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

        //Q.3 Sum of each element in Array.
//
//        int sum=0;
//        for (int k=0;k<+arr.length;k++){
//            sum+=arr[k];
//        }
//        System.out.println("Sum of the all element in this array is: "+sum);

        //Q.4 Find the Second  largest value in the array List.

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int l=0;l<arr.length;l++){
            if (arr[l]>first){
                second=first;
                first=arr[l];
            }else if (arr[l]>second && arr[l] != first ){
                second=arr[l];
            }
            System.out.print("Second largest number is : "+second);
        }





    }
}
