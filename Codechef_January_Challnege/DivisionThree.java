package com.january.longchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
class DivisionThree
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine().trim());
        for(int i=0;i<test;i++)
        {
            int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n=arr[0];
            int k=arr[1];
            int d=arr[2];
            int arr1[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            BigInteger sum=new BigInteger("0");
            if(n==1)
            {
                if(k>arr1[0])
                {
                    System.out.println("0");
                }
                else
                {
                    int result=arr1[0]/k;
                    if(result>d)
                    {
                        System.out.println(d);
                    }
                    else
                    {
                        System.out.println(result);
                    }
                }
            }
            else{
            for(int j=0;j<n;j++)
            {
                sum=sum.add(new BigInteger(Integer.toString(arr1[j])));
            }
            BigInteger res=sum.divide(new BigInteger(Integer.toString(k)));
            if(res.compareTo(new BigInteger(Integer.toString(d)))==1)
            {
                System.out.println(d);
            }
            else
            {
                System.out.println(res);
            }
        }
        }
    }
}