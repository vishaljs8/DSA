class Solution {
     int MOD = 1000000007;

    public int numberOfPermutations(int n, int[][] requirements) { 
        Map<Integer,Integer> map = new HashMap<>();
        int max =0;
        for(int[] r: requirements ){
            map.put(r[0],r[1]);
            max =Math.max(max , r[1]);
        }
        long[][] dp = new long[n][max+1];
        for(long i[]  :dp){
            Arrays.fill(i,-1);
        }
        return (int)solve( 0, n-1, 0, map, dp)%MOD;
    }
    private long solve(int n, int lastIndex, int inversions, Map<Integer,Integer> map, long[][] dp){
        if (n == lastIndex) {
               if (!map.containsKey(n) || inversions == map.get(n))
                    return 1;
                   return 0;
            }
        long ans =0;
        if(dp[n][inversions]!=-1) return dp[n][inversions];
        for(int i=0; i<=n+1; i++){
            int temp = inversions+((n+1)-i);
            if(temp<dp[0].length && (!map.containsKey(n+1) || temp == map.get(n+1))){
                ans += solve(n+1 , lastIndex , temp, map,dp)%MOD;
            }
        }
        return dp[n][inversions]=ans%MOD;
    }
}