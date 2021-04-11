package com.october.challenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SplitString {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine().trim());
			for(int i=0;i<test;i++)
			{
				int size=Integer.parseInt(br.readLine().trim());
				String string=br.readLine().trim();
				String sub="";
				sub+=string.charAt(size-1);
				if(string.substring(0,size-1).contains(sub))
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
