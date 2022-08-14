package com.bridgelabz.algorithm;

public class BinarySearch {
    boolean findElement() {
        String words[] = {"apple","banana","grapes","mango","orange"};
        String key = "apple";
        boolean flag=false;
        int first = 0;
        int last = words.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (words[mid].compareTo(key)<0) {
                first = mid + 1;
            } else if (words[mid].compareTo(key)==0)
            {
                flag=true;
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return flag;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        if(binarySearch.findElement())
        {
            System.out.println("word is present ");
        }
        else {
            System.out.println("word is not present");
        }

    }
}
