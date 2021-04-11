package com.october.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Queries {
	    public static void main(String args[]) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int test = Integer.parseInt(br.readLine());
	        for (int i = 0; i < test; i++) {
	            String arr1[] = br.readLine().split(" ");
	            BigInteger residue = new BigInteger("0");
	            String arr[] = br.readLine().split(" ");
	            BigInteger diff=new BigInteger("0");
	            BigInteger cap = new BigInteger(arr1[1]);
	            int counter = 0;
	            for (int k = 0; k < arr.length; k++) {
	                if (residue.add(new BigInteger(arr[k])).compareTo(cap) > 1) {
	                    diff=residue.subtract(cap);
	                    residue = residue.add(diff);
	                    counter++;
	                } else if (residue.add(new BigInteger(arr[k])).compareTo(cap) == 0) {
	                    diff=residue.subtract(cap);
	                    residue = residue.add(diff);
	                    counter++;
	                } else {
	                        counter++;
	                        break;
	                    }
	                }
	            System.out.println(counter);
	        }
	    }
	}

