package com.bridgelabz.algorithm;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {
    public boolean isPrime(int num) {
        if (num == 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
