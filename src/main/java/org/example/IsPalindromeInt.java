package org.example;

public class IsPalindromeInt {
    public boolean isPalindrome(int x) {

        String answer = String.valueOf(x);

        StringBuilder sb = new StringBuilder(answer);

        if(!sb.reverse().toString().equals(answer)){
            return false;
        }

        return true;
    }
}
