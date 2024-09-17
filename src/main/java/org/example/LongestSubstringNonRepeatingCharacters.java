package org.example;

public class LongestSubstringNonRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int answer = 0;

        for(int i =0; i<n; i++){
            boolean[] visited = new boolean[256];//Array to track the visited characters
            for(int j=i; j<n; j++){
                if(visited[s.charAt(j)]){
                    break;
                }
                else{
                    answer = Math.max(answer,j-i+1);//Update the max length of the substring found
                    visited[s.charAt(j)] = true; //Mark the character as visited
                }
            }
        }
        return answer;
    }
}
