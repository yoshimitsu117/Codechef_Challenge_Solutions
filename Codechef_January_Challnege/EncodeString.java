package com.january.longchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class EncodeString {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine().trim());
        Map<String,Character> mapForLowerCaseLetters=new HashMap<>();
        mapForLowerCaseLetters.put("0000",'a');
        mapForLowerCaseLetters.put("0001",'b');
        mapForLowerCaseLetters.put("0010",'c');
        mapForLowerCaseLetters.put("0011",'d');
        mapForLowerCaseLetters.put("0100",'e');
        mapForLowerCaseLetters.put("0101",'f');
        mapForLowerCaseLetters.put("0110",'g');
        mapForLowerCaseLetters.put("0111",'h');
        mapForLowerCaseLetters.put("1000",'i');
        mapForLowerCaseLetters.put("1001",'j');
        mapForLowerCaseLetters.put("1010",'k');
        mapForLowerCaseLetters.put("1011",'l');
        mapForLowerCaseLetters.put("1100",'m');
        mapForLowerCaseLetters.put("1101",'n');
        mapForLowerCaseLetters.put("1110",'o');
        mapForLowerCaseLetters.put("1111",'p');
        for(int i=0;i<test;i++)
        {
            int size=Integer.parseInt(br.readLine().trim());
            String encoded=br.readLine().trim();
            for(int j=0;j<size;j+=4)
            {
                System.out.print(mapForLowerCaseLetters.get(encoded.substring(j,j+4)));  
                
            }
            System.out.println();  
        }
    }

}