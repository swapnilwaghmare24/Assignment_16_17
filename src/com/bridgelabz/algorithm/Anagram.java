package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    boolean isAnagram(String str1, String str2) {
        boolean result=false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            result=Arrays.equals(charArray1, charArray2);
        }
       return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Anagram anagram=new Anagram();
        System.out.println("enter two strings");
        String str1=sc.next();
        String str2=sc.next();
        if(anagram.isAnagram(str1, str2))
        {
            System.out.println(str1+" is anagram of "+str2);
        }
        else
        {
            System.out.println(str1+" is not anagram of "+str2);
        }



    }
}
