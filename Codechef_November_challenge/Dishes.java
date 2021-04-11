package com.november.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dishes {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine().trim());
			for(int i=0;i<test;i++)
			{
				int n=Integer.parseInt(br.readLine().trim());
				int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int first_burner=0;
				int second_burner=0;
						if(n==1)
						{
							System.out.println(arr[0]);
						}
						else if(n==2)
						{
							Arrays.sort(arr);
							if(arr[0]==arr[1])
							{
								System.out.println(arr[0]);
							}
							else
							{
								System.out.println(arr[1]);
							}
						}
						else if(n==3)
						{
							Arrays.sort(arr);
							if(arr[0]==arr[1] && arr[0]==arr[2])
							{
								System.out.println(arr[0]+arr[1]);
							}
							else
							{
								first_burner=arr[n-1];
								second_burner=arr[n-2]+arr[n-3];
								System.out.println(Math.max(first_burner,second_burner));
							}
						}
						else if(n==4)
						{
							Arrays.sort(arr);
							if(arr[0]==arr[1] && arr[0]==arr[2] && arr[0]==arr[3])
							{
								System.out.println(arr[0]+arr[1]);
							}
							else
							{
								first_burner=arr[n-1];
								second_burner=arr[n-2]+arr[n-3];
								if(first_burner<=second_burner)
								{
									first_burner+=arr[n-4];
								}
								else
								{
									second_burner+=arr[n-4];
								}
								System.out.println(Math.max(first_burner, second_burner));
							}
						}
			}
		}
}
