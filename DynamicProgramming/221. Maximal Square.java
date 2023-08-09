// Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

class Solution {
    public int maximalSquare(char[][] matrix) {
        int ans = 0;

        int dp[][] = new int[matrix.length][matrix[0].length];

        for(int i=matrix.length-1; i>=0; i--){
            for(int j=matrix[0].length-1; j>=0; j--){
                // fill last and last column as it is
                if(i==matrix.length-1 || j==matrix[0].length-1){
                    dp[i][j] = Character.getNumericValue(matrix[i][j]);
                }
                else{
                    if(matrix[i][j] == '0'){
                        dp[i][j] = 0;
                    }
                    else{
                        // ith index tells maximal square i.e min(vertical, horizontal and diagonal)
                        int temp = Math.min(dp[i][j+1], dp[i+1][j]);
                        dp[i][j] = Math.min(temp, dp[i+1][j+1]) + 1;
                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans*ans;
    }
}