package com.april.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class WorldRecord {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=0;i<test;i++)
		{
			double[] arr=Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
			double time=100/(arr[0]*arr[1]*arr[2]*arr[3]);
			BigDecimal b=new BigDecimal(time);
			double val=9.58;
			if(b.setScale(2,RoundingMode.HALF_UP).compareTo(new BigDecimal(val).setScale(2,RoundingMode.HALF_UP))>=0)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}

}
