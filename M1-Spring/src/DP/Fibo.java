package DP;

import java.util.Arrays;

public class Fibo {
    static int[]dp;
    public static void main(String[] args) {
        int n = 7;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
