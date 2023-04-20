// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int ans=0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            ans=rem+ans*10;
            
        }
        return ans==temp;
    }
}