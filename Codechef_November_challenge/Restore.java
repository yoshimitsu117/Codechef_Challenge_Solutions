package com.november.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restore {
	static int limit=4000001;
	static boolean[] isprime=new boolean[limit];
	static List<Integer> primeList=new ArrayList<>();
	public static void generateSieve()
	{
		for(int i=0;i<limit;i++)
		{
			isprime[i]=true;
		}
		for(int j=2;j*j<limit;j++)
		{
			if(isprime[j])
			{
			for(int k=j*j;k<limit;k+=j)
			{
				isprime[k]=false;
			}
			}
		}
		for(int k=2;k<limit;k++)
		{
			if(isprime[k])
			{
			primeList.add(k);
			}
		}
	}
		public static void main(String args[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine().trim());
			generateSieve();
			for(int i=0;i<test;i++)
			{
				int n=Integer.parseInt(br.readLine().trim());
				int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				List<Integer> finalList=new ArrayList<>();
				Map<Integer,Integer> mapper=new HashMap<>();
				for(int k=0;k<n;k++)
				{
					mapper.put(arr[k],mapper.getOrDefault(arr[k],0)+1);
				}
				for(int m=0;m<n;m++)
				{
					finalList.add(primeList.get(arr[m]));
					mapper.put(arr[m],mapper.get(arr[m])-1);
				}
				for(int h:finalList)
				{
					System.out.print(h+" ");
				}
				System.out.println();
			}
		}
}
