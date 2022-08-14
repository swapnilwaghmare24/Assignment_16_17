package com.bridgelabz.algorithm;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {
    LinkedList<Integer> linkedList=new LinkedList<>();
    public boolean isPrime(int i)
    {
        for (int j = 2; j * j <= i; j++)
                if (i % j == 0)
                {
                    return false;
                }
        return true;
    }

    List addPrime()
    {
        for (int i = 2; i<= 1000; i++)
        {
        if(isPrime(i))
        {
            linkedList.add(i);
        }
    }
        return linkedList;
}
}
