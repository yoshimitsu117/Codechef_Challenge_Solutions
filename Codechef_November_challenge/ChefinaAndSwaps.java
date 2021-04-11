package com.november.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChefinaAndSwaps {
			public static void main(String args[]) throws IOException
			{
				BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				int test=Integer.parseInt(br.readLine().trim());
				for(int i=0;i<test;i++)
				{
					int size=Integer.parseInt(br.readLine().trim());
					Set<Integer> setList=new HashSet<>();
					String arr[]=br.readLine().trim().split(" ");
					int arr1[]=new int[size];
					int count1[]=new int[1000000001];
					//Now getting count of every element in first array
					for(int k=0;k<size;k++)
					{
						arr1[k]=Integer.parseInt(arr[k]);
						count1[arr1[k]]=+1;
						setList.add(arr1[k]);
					}
					String arr2[]=br.readLine().trim().split(" ");
					int arr3[]=new int[size];
					int count2[]=new int[1000000001];
					//Now similarly getting count of every element in second array
					for(int k=0;k<size;k++)
					{
						arr3[k]=Integer.parseInt(arr2[k]);
						count2[arr3[k]]=+1;
						setList.add(arr3[k]);
					}
					boolean identical=true;
					
					//Counting no of elements deficit in both arrays for identical.
					List<Integer> diff=new ArrayList<>();
					List<Integer> diff1=new ArrayList<>();
					for(int itr:setList)
					{
						if(arr1[itr]!=arr3[itr])
						{
							identical=false;
							if(Math.abs(arr1[itr]-arr3[itr])%2!=0)
							{
								identical=false;
								break;
							}
							if(arr1[itr]>arr3[itr])
							{
								diff.add(arr1[itr]);
							}
							if(arr3[itr]>arr1[itr])
							{
								diff1.add(arr1[itr]);
							}
						}
					}
					//now making pairs of elements to swap from the list of differences in count.
					
					
				}
			}
}
