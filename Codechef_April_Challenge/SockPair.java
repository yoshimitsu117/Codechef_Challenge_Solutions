package com.april.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SockPair {
public static void main(String args[]) throws IOException
{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int[] arr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int a=arr[0];
	int b=arr[1];
	int c=arr[2];
	if(a==b || b==c || c==a)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	
}
}
