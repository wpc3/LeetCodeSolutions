package org.example;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
    int maxCounter = 0;
    StringBuilder answer = new StringBuilder(s);
      for(int i =0; i<s.length(); i++){
          for (int j=i; i<s.length(); i++){

              if(answer.substring(0,j-i+1) == answer.reverse().substring(0,j-i+1) && answer.length()== Math.max(maxCounter,j-i+1)){
                  return answer.toString();
              }
          }
      }
     return null;
    }
}
