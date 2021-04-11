package com.november.challenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class UnusualQueries {
	public static int LIS(int[] arr,int begin,int end,int size)
	{
		int[] list=new int[size+1]; 
		//Initializing the array for sequence count to be 1 at any particular index.
		for(int i=begin;i<=end;i++)
		{
			list[i]=1;
		}
		//Checking if the element in the right is greater than the element in the left and also the counting how many elements are less than the particular element at that index.
		for(int i=begin+1;i<=end;i++)
		{
			for(int j=begin;j<i;j++)
			{
				if(arr[j]<arr[i] && list[i]<list[j]+1)
				{
					list[i]=list[j]+1;
				}
			}
		}
		//Now will check the max count in the list
		int max=0;
		for(int i=begin;i<=end;i++)
		{
		if(list[i]>max)	
		{
			max=list[i];
		}
		}
		return max;
	}
		public static void main(String args[]) throws NumberFormatException, IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
				int[] arr=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int n=arr[0];
				int q=arr[1];
				int s=arr[2];
				String t[]=br.readLine().trim().split(" ");
				int[] arr1=new int[n+1];
				for(int i=1;i<n+1;i++)
				{
					arr1[i]=Integer.parseInt(t[i-1]);
				}
				int last=0;
				int result=0;
				for(int i=0;i<q;i++)
				{
					int input[] =Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
					int x=input[0];
					int y=input[1];
					int l=(x+s*last-1)%n+1;
					int r=(y+s*last-1)%n+1;
					//Swapping the position if l is greater than r
					if(l>r)
					{
					int temp=0;
					temp=l;
					l=r;
					r=temp;
					}
					result=LIS(arr1,l,r,n);
					bw.write(Integer.toString(result));
					bw.newLine();
					last=result;
				}
				bw.flush();
				
		}
}
