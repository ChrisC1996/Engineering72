package com.sparta.chris;
import java.util.Arrays;

public class Palindrome {

    public static boolean stringCheck(String word) {
        for(int i=0; i<word.length()/2;i++) {
            if(word.charAt(word.length()-1-i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String findLongestPalindrome(String sentence) {
        String[] wordsArr = sentence.split(" ");
        String longest = "";
        Arrays.sort(wordsArr);

        for(int i=0; i< wordsArr.length; i++) {
            // word is a palindrome, length is at least 3 characters and is longer than the current longest palindrome found
            if(Palindrome.stringCheck(wordsArr[i]) && wordsArr[i].length() > 2 && (wordsArr[i].length() > longest.length())) {
                longest = wordsArr[i];
            }
        }

        if(longest.length() == 0)
            return "No palindrome was found in the string";
        else
            return longest;
    }

}
