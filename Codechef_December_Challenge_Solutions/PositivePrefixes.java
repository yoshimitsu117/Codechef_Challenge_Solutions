package com.december.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositivePrefixes {
	public static int initializeArray(int[] arr,int n)
	{
		int count=0;
		if(n%2==0)
		{
		for(int l=0;l<n;l++)
		{
			if(l+1%2!=0)
			{
				arr[l]=-(l+1);
				count++;
			}
			else
			{
				arr[l]=(l+1);
			}
		}
		}
		else
		{
			for(int l=0;l<n;l++)
			{
				if(l+1%2!=0)
				{
					arr[l]=(l+1);
				}
				else
				{
					arr[l]=-(l+1);
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int test=Integer.parseInt(br.readLine());
	for(int i=0;i<test;i++)
	{
		String arr[]=br.readLine().trim().split(" ");
		int n=Integer.parseInt(arr[0]);
		int k=Integer.parseInt(arr[1]);
		int source[]=new int[n];
		int cnt=initializeArray(source,n);
		int diff=n-cnt;
		if(diff==k)
		{
			break;
		}
		else if(diff<k)
		{
			if(n%2!=0)
			{
			for(int j=n-1;j>=0;j-=2)
			{
				source[j]=-(source[j]);
				diff++;
				if(diff==k)
				{
					break;
				}
			}
			}
			else
			{
				for(int j=n-2;j>=0;j-=2)
				{
					source[j]=-(source[j]);
					diff++;
					if(diff==k)
					{
						break;
					}
				}
			}
		}
		else
		{
			if(n%2!=0)
			{
			for(int j=n-1;j>=0;j-=2)
			{
				source[j]=(source[j]);
				diff--;
				if(diff==k)
				{
					break;
				}
			}
			}
			else
			{
				for(int j=n-2;j>=0;j-=2)
				{
					source[j]=(source[j]);
					diff--;
					if(diff==k)
					{
						break;
					}
				}
			}
			
		}
		for(int h=0;h<n;h++)
		{
			System.out.print(source[h]+" ");
		}
		System.out.println();
	}
	
	}
}
