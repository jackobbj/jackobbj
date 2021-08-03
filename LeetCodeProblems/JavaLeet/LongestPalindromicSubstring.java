//By Jack Hodges 3/08/2021
package LeetCodeProblems.JavaLeet;
public class LongestPalindromicSubstring {
    /** A solution for the longest palindromic substring problem defined as:
     * 
     * Given a string s, return the longest palindromic substring in s.
     * 
     * @param s A string containing only english letters
     * @return The longest palindrome contained in s.
     */
    public String solution(String s){
        String[] arr = s.split("");
        String max = "";
        for (int i=0; i <arr.length; i++){
            for (int parity = 0; parity < 2; parity++){ // for both odd and even palindromes
                String curr = arr[i];
                if (parity == 1){
                    curr="";
                }
                for (int j=1; (i+j<arr.length) && i-j+parity>=0;j++){
                    if(arr[i+j].equals(arr[i-j+parity])){
                        curr = arr[i-j+parity]+curr+arr[i+j];
                    } else {
                        break;
                    };
                };
                if (max.length() < curr.length()){
                    max = curr;
                };
            };
        };
        return max;
    }
}
