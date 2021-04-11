package com.october.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanForNothing {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numbers=Integer.parseInt(br.readLine().trim());
		Map<List<Integer>,Integer> mapper=new HashMap<>();
		int smallest=10000000;
		for(int i=0;i<numbers;i++)
		{
			String arr[]=br.readLine().trim().split(" ");
			if(Integer.parseInt(arr[0])==0)
			{
				List<Integer> temp=new ArrayList<>();
				temp.add(0);
				temp.add(0);
				mapper.put(temp,1);
				smallest=0;
			}
			else
			{
			for(int k=1;k<(2*Integer.parseInt(arr[0])+1);k+=2)
			{
				List<Integer> temp=new ArrayList<>();
				temp.add(Integer.parseInt(arr[k]));
				temp.add(Integer.parseInt(arr[k+1]));
				if(smallest>Integer.parseInt(arr[k]))
				{
					smallest=Integer.parseInt(arr[k]);
				}
				if(smallest>Integer.parseInt(arr[k+1]))
				{
					smallest=Integer.parseInt(arr[k+1]);
				}
					mapper.put(temp,1);
			}
			}
			
		}
		int lpos=0;
		int rpos=0;
		for(Map.Entry<List<Integer>,Integer> iterate:mapper.entrySet())
		{
			List<Integer> temp=iterate.getKey();
			
		}
		
		boolean flag=false;
		int free=0;
	for(int j=smallest;j<=100000;j++)
	{
		flag=false;
		for(Map.Entry<List<Integer>,Integer> iterate:mapper.entrySet())
		{
				List<Integer> temp=iterate.getKey();
				if((j==temp.get(0) && j<temp.get(1)) || (j>temp.get(0) && j<temp.get(1)) || (j>temp.get(0) && j==temp.get(1)) || (j==temp.get(0) && j==temp.get(1)))
				{
					free=j;
					flag=true;
					break;
				}
		}
		if(!flag)
		{
			free=j;
			break;
		}
	}
		if(!flag)
		{
            if(free==0)
            {
			System.out.println(free+1);
            }
            else{
                System.out.println(free);
            }
		}
		else
		{
			if((smallest+1000000)<(free+1))
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(free+1);
			}
		}
	}
}
