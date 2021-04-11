package february.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

class MaximiseFunction {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<test;i++)
		{
			int size=Integer.parseInt(br.readLine().trim());
		int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		int begin=arr[0];
		int end=arr[size-1];
		BigInteger max=new BigInteger("0");
		for(int j=1;j<size-1;j++)
		{
			BigInteger first=new BigInteger(Integer.toString((begin-arr[j])));
			BigInteger second=new BigInteger(Integer.toString((arr[j]-end)));
			BigInteger third=new BigInteger(Integer.toString((end-begin)));
			BigInteger res1=first.abs().add(second.abs());
			BigInteger res2=res1.add(third.abs());
			if(max.compareTo(res2)==-1)
			{
					max=res2;
			}
		}
		System.out.println(max);
		}
	}

}


