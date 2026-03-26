class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long total = 0;
        int[] rowsum = new int[m], colsum = new int[n];
        Map<Integer, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowsum[i] += grid[i][j];
                total += grid[i][j];
                hm2.put(grid[i][j], hm2.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) colsum[j] += grid[i][j];
        }
        long temp = 0;
        Map<Integer, Integer> hm1 = new HashMap<>();
        for (int i = 0; i < m - 1; i++) {
            temp += rowsum[i];
            for (int j = 0; j < n; j++) hm1.put(grid[i][j], hm1.getOrDefault(grid[i][j], 0) + 1);
            long s1 = temp, s2 = total - temp;
            if (s1 == s2) return true;
            if (s1 > s2) {
                long d = s1 - s2;
                if (d > Integer.MAX_VALUE) continue;
                if (n == 1) {
                    if (grid[0][0] == d || grid[i][0] == d) return true;
                } else if (i == 0) {
                    if (grid[0][0] == d || grid[0][n - 1] == d) return true;
                } else if (hm1.containsKey((int) d)) return true;
            } else {
                long d = s2 - s1;
                if (d > Integer.MAX_VALUE) continue;
                if (n == 1) {
                    if (grid[i + 1][0] == d || grid[m - 1][0] == d) return true;
                } else if (i == m - 2) {
                    if (grid[m - 1][0] == d || grid[m - 1][n - 1] == d) return true;
                } else {
                    if (hm2.getOrDefault((int) d, 0) - hm1.getOrDefault((int) d, 0) > 0) return true;
                }
            }
        }
        temp = 0;
        hm1.clear();
        for (int j = 0; j < n - 1; j++) {
            temp += colsum[j];
            for (int i = 0; i < m; i++) hm1.put(grid[i][j], hm1.getOrDefault(grid[i][j], 0) + 1);
            long s1 = temp, s2 = total - temp;
            if (s1 == s2) return true;
            if (s1 > s2) {
                long d = s1 - s2;
                if (d > Integer.MAX_VALUE) continue;
                if (m == 1) {
                    if (grid[0][0] == d || grid[0][j] == d) return true;
                } else if (j == 0) {
                    if (grid[0][0] == d || grid[m - 1][0] == d) return true;
                } else if (hm1.containsKey((int) d)) return true;
            } else {
                long d = s2 - s1;
                if (d > Integer.MAX_VALUE) continue;
                if (m == 1) {
                    if (grid[0][j + 1] == d || grid[0][n - 1] == d) return true;
                } else if (j == n - 2) {
                    if (grid[0][n - 1] == d || grid[m - 1][n - 1] == d) return true;
                } else {
                    if (hm2.getOrDefault((int) d, 0) - hm1.getOrDefault((int) d, 0) > 0) return true;
                }
            }
        }
        return false;
    }
}