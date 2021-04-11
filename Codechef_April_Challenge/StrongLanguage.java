package com.april.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StrongLanguage {
	
			public static void main(String args[]) throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int test=Integer.parseInt(br.readLine());
				for(int i=0;i<test;i++)
				{
					int[] arr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
					int n=arr[0];
					int k=arr[1];
					String text=br.readLine();
					int count=0;
					int max_count=0;
					for(int l=0;l<text.length();l++)
					{
						if(text.charAt(l)=='*')
						{
							count++;
							if(count>max_count)
							{
								max_count=count;
							}
						
						}
						else
						{
							count=0;
						}
						
					}
					if(max_count>=k)
					{
						System.out.println("YES");
					}
					else
					{
						System.out.println("NO");
					}
				}
			}
			
}
