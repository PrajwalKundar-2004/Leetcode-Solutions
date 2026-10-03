class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return uniquePaths(m-1,n-1,dp);
    }
     int uniquePaths(int row,int col,int[][] dp){
        if(row==0 || col==0){
            return 1;
        }
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        dp[row][col]=uniquePaths(row-1,col,dp)+uniquePaths(row,col-1,dp);
        return dp[row][col];
    }
}