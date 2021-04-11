package com.december.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VacccineProduction {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr[]=br.readLine().trim().split(" ");
		int d1=Integer.parseInt(arr[0]);
		int v1=Integer.parseInt(arr[1]);
		int d2=Integer.parseInt(arr[2]);
		int v2=Integer.parseInt(arr[3]);
		int p=Integer.parseInt(arr[4]);
		int count_days=0;
			if(d1==d2)
			{
				if(d1>1)
				{
						if(p%(v1+v2)!=0)
						{
							count_days+=(p/(v1+v2))+1;
							count_days+=(d1-1);
							System.out.println(count_days);
						}
						else
						{
							count_days=(p/(v1+v2));
							count_days+=(d1-1);
							System.out.println(count_days);
						}
				}
					else
					{
						if(p%(v1+v2)!=0)
						{
							count_days+=(p/(v1+v2))+1;
							System.out.println(count_days);
							
						}
						else
						{
							count_days=(p/(v1+v2));
							System.out.println(count_days);
							
						}
						
					}
			}
			else
			{
				if(d2>d1)
				{
				int index1=d1;
				int index2=d2;
				int req=0;
				while(req<p)
				{
					if(index1<index2)
					{
					req+=v1;
					index1++;
					count_days+=1;
					}
					else
					{
						req+=(v1+v2);
						count_days+=1;
					}
					
				}
				count_days+=d1-1;
				System.out.println(count_days);
				}
				else
				{
					int index1=d2;
					int index2=d1;
					int req=0;
					while(req<p)
					{
						if(index1<index2)
						{
						req+=v2;
						index1++;
						count_days+=1;
						}
						else
						{
							req+=(v1+v2);
							count_days+=1;
						}
						
					}
					count_days+=d2-1;
					System.out.println(count_days);
				}
				
			}
			
	}

}
