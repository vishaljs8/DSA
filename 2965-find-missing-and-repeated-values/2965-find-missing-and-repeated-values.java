class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long m = grid.length;
        long n = m * m;
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++){
            S += grid[i][j];
            S2 += (long) grid[i][j] * (long) grid[i][j];
        }
        }

        long val1 = S - SN; 

        long val2 = S2 - S2N;

        val2 = val2 / val1;
        long x = (val1 + val2) / 2; 
        long y = x - val1;          

        return new int[]{(int) x, (int) y};
    }
}