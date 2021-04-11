package com.january.longchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
class FairElections {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine().trim());
        for(int i=0;i<test;i++)
        {
            int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            BigInteger sum=new BigInteger("0");
            BigInteger sum1=new BigInteger("0");
            int n=arr[0];
            int m=arr[1];
            int input1[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int input2[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            //Sorting both the Arrays
          Arrays.sort(input1);
          Arrays.sort(input2);
            if(n>m)
            {
                for(int j=0;j<n;j++)
                    {
                        if(j>m || j==m){
                        sum=sum.add(new BigInteger(Integer.toString(input1[j])));
                        }
                        else{
                            sum=sum.add(new BigInteger(Integer.toString(input1[j])));
                            sum1=sum1.add(new BigInteger(Integer.toString(input2[j])));
                        }
                    }
            }
            else if(n<m)
            {
                for(int j=0;j<m;j++)
                {
                    if(j>n || j==n){
                        sum1=sum1.add(new BigInteger(Integer.toString(input2[j])));
                    }
                    else{
                        sum=sum.add(new BigInteger(Integer.toString(input1[j])));
                        sum1=sum1.add(new BigInteger(Integer.toString(input2[j])));
                    }
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {          
                    sum=sum.add(new BigInteger(Integer.toString(input1[j])));
                    sum1=sum1.add(new BigInteger(Integer.toString(input2[j])));
                }   
            }

            //We have got the sum now we have to check for no of swaps required.
            if(sum.compareTo(sum1)==1)
            {
                System.out.println("0");
            }
            else{
                    if(n>m)
                    {
                        int counter=0;
                            for(int k=0;k<m;k++)
                            {
                                sum=sum.subtract(new BigInteger(Integer.toString(input1[k])));
                                sum=sum.add(new BigInteger(Integer.toString(input2[m-k-1])));
                                sum1=sum1.subtract(new BigInteger(Integer.toString(input2[m-k-1])));
                                sum1=sum1.add(new BigInteger(Integer.toString(input1[k])));
                                counter++;
                                if(sum.compareTo(sum1)==1)
                                {
                                    break;
                                }
                            }
                    if(sum.compareTo(sum1)==1)
                        {
                        System.out.println(counter);
                        }
                        else{
                            System.out.println("-1");
                        }
                    }
                    else if(n<m)
                    {
                        int counter=0;
                        for(int k=0;k<n;k++)
                        {
                            sum=sum.subtract(new BigInteger(Integer.toString(input1[k])));
                            sum=sum.add(new BigInteger(Integer.toString(input2[m-k-1])));
                            sum1=sum1.subtract(new BigInteger(Integer.toString(input2[m-k-1])));
                            sum1=sum1.add(new BigInteger(Integer.toString(input1[k])));
                            counter++;
                            if(sum.compareTo(sum1)==1)
                            {
                                break;
                            }
                        }
                        if(sum.compareTo(sum1)==1)
                        {
                        System.out.println(counter);
                        }
                        else{
                            System.out.println("-1");
                        }
                    }
                    else
                    {
                        int counter=0;
                        for(int k=0;k<n;k++)
                        {
                            sum=sum.subtract(new BigInteger(Integer.toString(input1[k])));
                            sum=sum.add(new BigInteger(Integer.toString(input2[m-k-1])));
                            sum1=sum1.subtract(new BigInteger(Integer.toString(input2[m-k-1])));
                            sum1=sum1.add(new BigInteger(Integer.toString(input1[k])));
                            counter++;
                            if(sum.compareTo(sum1)==1)
                            {
                                break;
                            }
                        }
                        if(sum.compareTo(sum1)==1)
                        {
                        System.out.println(counter);
                        }
                        else{
                            System.out.println("-1");
                        }
                    }
                    
        }
        }
    }
    
}
