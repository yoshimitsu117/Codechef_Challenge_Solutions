package com.november.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fema {
	public static int distq(String expression,int i,int j)
	{
		int y=0;
		if(i>j)
		{
		for(int index=i;index>=j;index--)
		{
			if(expression.charAt(index)==':') {
				y++;
			}
		}
		}
		else
		{
			for(int index=i;index<=j;index++)
			{
				if(expression.charAt(index)==':') {
					y++;
				}
			}
		}
		return y;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=0;i<test;i++)
		{
			int[] arr=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n=arr[0];
			int k=arr[1];
			String expression=br.readLine().trim();
			int q=0;
			int p=0;
			int power=k+1;
			int m=0;
			int f=0;
			int cs=0;
			while(p<n && q<n)
			{
				if(expression.charAt(p)=='M') {
					if(expression.charAt(q)=='I')
					{
						f=(power-Math.abs(p-q));
						if(f>0)
						{
							cs=distq(expression,p,q);
							if(f-cs>0)
							{
							m++;
							p++;
							q++;
							}
							else
							{
								if(p>q)
								{
									q++;
								}
								else
								{
									p++;
								}
							}
						}
						else
						{
							if(p>q)
							{
								q++;
							}
							else
							{
								p++;
							}
						}
						
					}
					else if(expression.charAt(q)=='X')
					{
						p=q;
						p++;
						q++;
					}
					else
					{
						q++;
					}
				}
				else if(expression.charAt(p)=='X')
				{
					q=p;
					p++;
					q++;
				}
				else
				{
					p++;
				}
			}
			System.out.println(m);
			
	}
}
}

