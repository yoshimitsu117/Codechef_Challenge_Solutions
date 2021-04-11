package com.december.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class EvenPairSum {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<test;i++)
		{
			String arr[]=br.readLine().trim().split(" ");
			BigInteger a=new BigInteger(arr[0]);
			BigInteger b=new BigInteger(arr[1]);
			//Count no of odd and no of even
			if(a.compareTo(BigInteger.valueOf(1))==0 && b.compareTo(BigInteger.valueOf(1))==0)
			{
				System.out.println("1");
			}
			else if(a.compareTo(BigInteger.valueOf(1))==0 && b.compareTo(BigInteger.valueOf(1))>1)
			{
				BigInteger residue=b.divide(BigInteger.valueOf(2));
				BigInteger result=b.subtract(residue);
				System.out.println(a.multiply(result));
			}
			else if(a.compareTo(BigInteger.valueOf(1))>1 && b.compareTo(BigInteger.valueOf(1))==0)
			{
				BigInteger residue=a.divide(BigInteger.valueOf(2));
				BigInteger result=a.subtract(residue);
				System.out.println(b.multiply(result));
			}
			else
			{
				//For Even
				BigInteger residue=a.divide(BigInteger.valueOf(2));
				BigInteger residue1=b.divide(BigInteger.valueOf(2));
				BigInteger even =residue.multiply(residue1);
				//For Odd
				BigInteger residue2=a.divide(BigInteger.valueOf(2));
				BigInteger residue3=b.divide(BigInteger.valueOf(2));
				BigInteger diff1=a.subtract(residue2);
				BigInteger diff2=b.subtract(residue3);
				BigInteger odd=diff1.multiply(diff2);
				System.out.println(even.add(odd));
			}
		}
	}
}
