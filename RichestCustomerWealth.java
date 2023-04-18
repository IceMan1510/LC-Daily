// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]

// Output: 17

class Solution {
    public int maximumWealth(int[][] accounts) {
         int max = Integer.MIN_VALUE;
        int sum ;
        int row = accounts.length; 
        int col = accounts[0].length; 
        for(int i=0;i<row;i++)
        {
            sum = 0;
            for(int j=0;j<col;j++)
            {
                sum += accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;

    }
    }
