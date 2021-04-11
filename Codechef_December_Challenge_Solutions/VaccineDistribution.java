package com.december.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VaccineDistribution {
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int test=Integer.parseInt(br.readLine());
	for(int i=0;i<test;i++)
	{
		String arr[]=br.readLine().trim().split(" ");
		int n=Integer.parseInt(arr[0]);
		int d=Integer.parseInt(arr[1]);
		String arr1[]=br.readLine().trim().split(" ");
		int[] source=new int[n];
		for(int k=0;k<n;k++)
		{
			source[k]=Integer.parseInt(arr1[k]);
		}
		int count=0;
		for(int l=0;l<n;l++)
		{
			if(source[l]>=80 || source[l]<=9)
			{
				count++;
			}
		}
		int count1=n-count;
		int ans=(int)Math.ceil(count/(double)d);
		int ans1=(int)Math.ceil(count1/(double)d);
		System.out.println(ans+ans1);
	}
	}
}
