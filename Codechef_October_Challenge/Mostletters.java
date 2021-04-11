package com.october.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Mostletters {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int size=Integer.parseInt(br.readLine().trim());
			String input=br.readLine().trim();
			Map<Character,Integer> mapper=new HashMap<>();
			for(int i=0;i<size;i++)
			{
				if(mapper.containsKey(input.charAt(i)))
				{
					int temp=mapper.get(input.charAt(i))+1;
					mapper.put(input.charAt(i),temp);
				}
				else
				{
					mapper.put(input.charAt(i),1);
				}
			}
			int max=0;
			for(Map.Entry<Character,Integer> iterate:mapper.entrySet())
			{
				if(iterate.getValue()>max)
				{
					max=iterate.getValue();
				}
			}
			System.out.println(max);
		}
}
