package com.november.challenge;

import java.util.Scanner;

public class Insertion {
	
			
	public static void bubbleSort(int[] arr) {  
        int n = arr.length-1;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
         for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
	}
  
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				int length=sc.nextInt();
				int[] arr=new int[length+1];
				for(int i=0;i<length;i++)
				{
					arr[i]=sc.nextInt();
				}
				//Sorting the array
				bubbleSort(arr);
				int pos=sc.nextInt();
				int ele=sc.nextInt();
				for(int i=length;i>=pos;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[pos-1]=ele;
				for(int i=0;i<=length;i++)
				{
					System.out.println(arr[i]);
				}
				
				
			}
}
