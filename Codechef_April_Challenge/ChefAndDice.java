package com.april.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ChefAndDice {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=0;i<test;i++)
		{
				BigInteger input=new BigInteger(br.readLine());
				if(input.compareTo(new BigInteger("1"))==0)
				{
					System.out.println("20");
				}
				else if(input.compareTo(new BigInteger("2"))==0)
				{
					System.out.println("36");
				}
				else if(input.compareTo(new BigInteger("3"))==0)
				{
					System.out.println("51");
				}
				else if(input.compareTo(new BigInteger("4"))==0)
				{
					System.out.println("60");
				}
				else
				{
					BigInteger res=input.mod(new BigInteger("4"));
					if(res.compareTo(new BigInteger("1"))==0)
					{
						BigInteger count=input.subtract(res);
						BigInteger inter=new BigInteger("4").subtract(res);
						count=count.subtract(inter);
						BigInteger total=count.multiply(new BigInteger("11"));
						BigInteger residue=inter.multiply(new BigInteger("15"));
						BigInteger sum=total.add(residue);
						sum=sum.add(new BigInteger("20"));
						System.out.println(sum);
					}
					else if(res.compareTo(new BigInteger("2"))==0)
					{
						BigInteger count=input.subtract(res);
						BigInteger inter=new BigInteger("4").subtract(res);
						count=count.subtract(inter);
						BigInteger total=count.multiply(new BigInteger("11"));
						BigInteger residue=inter.multiply(new BigInteger("15"));
						BigInteger sum=total.add(residue);
						sum=sum.add(new BigInteger("36"));
						System.out.println(sum);
					}
					else if(res.compareTo(new BigInteger("3"))==0)
					{
						BigInteger count=input.subtract(res);
						BigInteger inter=new BigInteger("4").subtract(res);
						count=count.subtract(inter);
						BigInteger total=count.multiply(new BigInteger("11"));
						BigInteger residue=inter.multiply(new BigInteger("15"));
						BigInteger sum=total.add(residue);
						sum=sum.add(new BigInteger("51"));
						System.out.println(sum);
					}
					else
					{
						BigInteger count=input.subtract(res);
						BigInteger inter=new BigInteger("4").subtract(res);
						count=count.subtract(inter);
						BigInteger total=count.multiply(new BigInteger("11"));
						BigInteger residue=inter.multiply(new BigInteger("15"));
						BigInteger sum=total.add(residue);
						System.out.println(sum);
					}
				}
		}
		}

}
