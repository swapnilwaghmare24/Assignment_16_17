package com.bridgelabz.algorithm;

import java.util.LinkedList;

public class TestClass
{
    public static LinkedList<Integer> filteredList = new LinkedList<>();
    public static void main(String[] args) {
            PrimeNumber pNum = new PrimeNumber();
            Palindrome palinDrome = new Palindrome();
            for (int i = 2; i <= 1000; i++) {
                if (pNum.isPrime(i)) {
                    filteredList.add(i);
                }
            }

            for (int i = 0; i < filteredList.size(); i++) {
                if (!isAnagramExist(filteredList.get(i), i)) {
                    filteredList.remove(i);
                    i--;
                }
            }

            for (int i = 0; i < filteredList.size(); i++) {
                if (!palinDrome.isPalindrome(filteredList.get(i))) {
                    filteredList.remove(i);
                    i--;
                }
            }

            for (int i = 0; i < filteredList.size(); i++) {
                System.out.println(filteredList.get(i));
            }
        }

        public static boolean isAnagramExist(int num, int index) {
            PrimeAnagram anagram = new PrimeAnagram();

            for (int i = 0; i < filteredList.size(); i++) {
                if (i != index) {
                    if (anagram.isAnagram(num,filteredList.get(i))) {
                        return true;
                    }
                }
            }
            return false;
        }

}
