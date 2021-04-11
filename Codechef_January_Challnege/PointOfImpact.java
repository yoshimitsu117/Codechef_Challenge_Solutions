package com.january.longchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;


class PointOfImpact {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine().trim());
        for(int i=0;i<test;i++)
        {
        int arr[]=Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n=arr[0];
        int k=arr[1];
        int x=arr[2];
        int y=arr[3];
        int[] change_x=new int[4];
        int[] change_y=new int[4];
        //Now we have to calculate four points according to the x and y coordinates as mentioned
        //1.x<y
        //2.x>y
        //3.x==y
        boolean flag=false;
        if(x<y)
        {
            
            change_x[0]=x+n-y;
            change_y[0]=n;
            change_x[1]=n;
            change_y[1]=n-y+x;
            change_x[2]=y-x;
            change_y[2]=0;
            change_x[3]=0;
            change_y[3]=y-x;
        }
        else if(x>y)
        {
            change_x[0]=n;
            change_y[0]=y+n-x;
            change_x[1]=y+n-x;
            change_y[1]=n;
            change_x[2]=0;
            change_y[2]=x-y;
            change_x[3]=x-y;
            change_y[3]=0;
        }
        else
        {
            flag=true;
        }
        if(flag)
        {
            System.out.print(n);
            System.out.print(" ");
            System.out.print(n);
            System.out.println();
        }
        else
        {
            System.out.print(change_x[(k-1)%4]);
            System.out.print(" ");
            System.out.print(change_y[(k-1)%4]);
            System.out.println();
        }
        }
        
    }
    
}