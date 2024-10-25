package nihar_automation;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //Array declaration
//        int [] arr;
//        int arr1 [];
//
//        //Initialize of array
//        int [] arr2=new int[8];
//        System.out.println(arr2[3]);


//        //here we print length and 4th index value
//       int [] arr3={2,3,4,5,6,7,8,9,10};
//        System.out.println(arr3.length);
//        System.out.println(arr3[4]);

        //for each loop(to retrive data from array and list)
        //for retrive of data from array or list we use for each loop and for  data insertion we use standard for loop
//        for (int val:arr3){
//            System.out.println(val);
//        }
//
//
//        System.out.println("===========================");
//
//        //using for loop printing the  whole array
//        for (int i=0;i<arr3.length;i++){
//            System.out.println(arr3[i]);
//        }

//        //Arrays class using tostring method
         //by using tostring method we can print whole array

//        int [] arrNew=new int[6];
//        System.out.println(Arrays.toString(arrNew));
//        //here we enter in 3rd index value is 5.
//        arrNew[3]=5;
//        System.out.println(Arrays.toString(arrNew));
//
//        //By using standard for loop here we are entering 2 in every index.
//
//        for (int i=0;i< arrNew.length;i++){
//            arrNew[i]=2;
//        }
//        System.out.println(Arrays.toString(arrNew));
//
//        //In Arrays Class there is another method called "fill" which basically used to entering value to array.
//        //syntax=Arrays.fill(the array name,which value you want to enter)
//        Arrays.fill(arrNew,5);
//        System.out.println(Arrays.toString(arrNew));

        //Here we use a Arrays class method called "sort" for sorting array element.
//        int arr[]={5,9,8,7,4,6};
//        Arrays.sort(arr);
//
//
//         //here we use for each loop to print the array
//        //For each syntax is like-->for(data type variable name:array name)
//        for (int vall: arr){
//            System.out.print(vall);
//        }
        //here we
        int arr1[]={12,34,54,65,78,89,90,45};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr1,2, arr1.length)));




        



    }


}
