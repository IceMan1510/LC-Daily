// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
class Solution {
    public boolean isPalindrome(String s) {
         
     int i = 0;
     int j = s.length() - 1;
     while (i < j) {
         
         Character start = s.charAt(i);
         Character end = s.charAt(j);
         
         if (!Character.isLetterOrDigit(start)) {
             i++;
             continue;
         }
         
         if (!Character.isLetterOrDigit(end)) {
             j--;
             continue;
         }
         
         if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
             return false;
         }
         
         i++;
         j--;    
     }
     
     return true;
 }
 }