package com.october.challenge;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pairs {
		public static void main(String args[]) throws IOException
		{
			Map mapper=generate();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine().trim());
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			Map<List<Integer>,Integer > mappingOutput=new HashMap<>();
			for(int i=0;i<test;i++)
			{
				int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int l=arr[0];
				int r=arr[1];
				int prime_count=0;
				int non_prime_count=0;
				if(l==r)
				{
					bw.write("0\n");
					bw.flush();
				}
				else{
					List<Integer> addition=new ArrayList<>();
					addition.add(l);
					addition.add(r);
					if(mappingOutput.containsKey(addition))
					{
						
						System.out.println(mappingOutput.get(addition));
				}
				else
				{
				for(int j=l;j<=r;j++)
				{
					if(j==1)
					{
						continue;
					}
					else{
					if(mapper.containsKey(j))
					{
						non_prime_count++;
					}
					else
					{
						prime_count++;
					}
					}
				}
				int prod=non_prime_count*prime_count;
				bw.write(Integer.toString(prod)+"\n");
				bw.flush();
			}
			}
			}
		}
		public static Map<Integer,Integer> generate()
		{
			Map<Integer,Integer> mapper=new HashMap<>();
			for(int k=2;k<Math.floor(Math.sqrt(100000));k++)
				{
					for(int l=k*k;l<=100000;l+=k)
					{
						mapper.put(l,1);
					}
				}
			return mapper;
		}
}
