package com.november.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Candies {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine().trim());
		int modulo=1000000007;
		for(int i=0;i<test;i++)
		{
			int size=Integer.parseInt(br.readLine().trim());
			int[] list=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int queries=Integer.parseInt(br.readLine().trim());
			
			for(int j=0;j<queries;j++)
			{
				int q=Integer.parseInt(br.readLine().trim());
				int present=0;
				//Three cases 
				//1.when 1 is present at 0
				
				
			}
		}
		
	}
}
