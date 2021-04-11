package com.october.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Absolute {
			public static void main(String args[]) throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int test=Integer.parseInt(br.readLine().trim());
				for(int i=0;i<test;i++)
				{
					int size=Integer.parseInt(br.readLine().trim());
					int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
					int arr1[]=new int[size];
					int counterneg=0;
					int counterpos=0;
					int index=size-1;
					if((size/2)%2!=0)
					{
						for(int j=0;j<size;j++)
						{
							
							if(arr[j]<0)
							{
								counterneg++;
							}
							if(arr[j]>0)
							{
								counterpos++;
							}
							if(arr[j]<0)
							{
								arr1[j]=arr[index];
								
							}
							if(arr[j]>0)
							{
								arr1[j]=-(arr[index]);
								
							}
							if(counterneg>size/2 && arr[j]<0)
							{
								arr1[j]=-(arr[index]);
							}
							if(counterpos>size/2 && arr[j]>0)
							{
								arr1[j]=arr[index];
							}
							if(j==((size)/2))
								
							{
								if(arr[j]>0 && arr[j-1]>0)
								{
									arr1[j]=arr[index];
									
								}
								else if(arr[j]<0 && arr[j-1]<0)
								{
									arr1[j]=-(arr[index]);
									
								}
								
							}
							index--;
						}
					}
					else
					{
					for(int j=0;j<size;j++)
					{
						if(arr[j]<0)
						{
							counterneg++;
						}
						if(arr[j]>0)
						{
							counterpos++;
						}
						if(arr[j]<0)
						{
							arr1[j]=arr[index];
						}
						if(arr[j]>0)
						{
							arr1[j]=-(arr[index]);
						}
						if(counterneg>size/2 && arr[j]<0)
						{
							arr1[j]=-(arr[index]);
						}
						if(counterpos>size/2 && arr[j]>0)
						{
							arr1[j]=arr[index];
						}
						index--;
					}
					}
					for(int k=0;k<size;k++)
					{
						System.out.print(arr1[k]+" ");
					}
					System.out.println();
				}
				
			}
}
