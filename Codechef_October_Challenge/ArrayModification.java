package com.october.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayModification {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int size=Integer.parseInt(br.readLine().trim());
			int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int counter=0;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i-1]>=2 && arr[i]>=2 || arr[i]>=2 && arr[i-1]<2)
				{
					counter++;
				}
			}
			System.out.println(counter);
				
				/*for(int j=1;j<arr.length;j++)
				{
					if(arr[j]>=2 && arr[j-1]<2)
					{
						arr[j]-=(2*((arr[j])/2));
						arr[j-1]+=(arr[j]/2);
					}
				}*/
				for(int j=1;j<arr.length;j++)
				{
					if(arr[j-1]>=2 && arr[j]>=2)
					{
						arr[j-1]-=(2*((arr[j-1])/2));
						arr[j]+=(arr[j-1]/2);
					}
					
				}
			System.out.println(arr[2]);
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1]);
		}
}
