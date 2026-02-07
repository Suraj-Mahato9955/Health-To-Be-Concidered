
Q. wap in java to accept n number in array and find out the total count of the digit.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int i,j,ar[]=new int[5];
        for(i=0;i<ar.length;i++)
        {
            System.out.println("enter the element");
            ar[i]=scan.nextInt();
        }
        for(i=0;i<ar.length;i++)
        {
            int count=0;
            int num=ar[i];
            while (num>0){
            num=num/10;
                       
           count++;
            }
            System.out.println("Digits in "+ar[i]+" are");
            System.out.println(count);
        }
        }
}



Q. wap in an array to swap the firs element to the last element and so on.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int i,j,ar[]=new int[5];
        for(i=0;i<ar.length;i++)
        {
            System.out.println("enter the element");
            ar[i]=scan.nextInt();
            
        }
        System.out.println("Array before swapping");
         for(i=0;i<ar.length;i++)
        {
        System.out.print("\t"+ar[i]);
            
        }
        
        for(i=0,j=ar.length-1;i<=(ar.length-1)/2;i++,j--)
        {
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
        }
        System.out.println("\nArray after swapping");
         for(i=0;i<ar.length;i++)
        {
        System.out.print("\t"+ar[i]);
            
        }
        
    }
}

Q. Write a program in java to find maximum and minimum number in array.

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
    }
}
