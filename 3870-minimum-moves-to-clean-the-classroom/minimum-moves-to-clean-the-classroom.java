import java.util.*;

class Solution {
    public int minMoves(String[] cls, int energy) {
        int m = cls.length, n = cls[0].length(), s1 = 0, s2 = 0, v = 0;
        int[][] grid = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = cls[i].charAt(j);
                if (ch == 'S') {
                    s1 = i;
                    s2 = j;
                    grid[i][j] = 0;
                } else if (ch == 'L') {
                    grid[i][j] = 10 + v;
                    v++;
                } else if (ch == 'R') {
                    grid[i][j] = 2;
                } else if (ch == 'X') {
                    grid[i][j] = 3;
                } else {
                    grid[i][j] = 0;
                }
            }
        }
        
        if (v == 0) return 0;
        
        int[][][] vis = new int[m][n][1 << v];
        for (int[][] a : vis) {
            for (int[] b : a) {
                Arrays.fill(b, -1);
            }
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{s1, s2, 0, energy, 0});
        vis[s1][s2][0] = energy;
        
        int[] d = {-1, 0, 1, 0, -1};
        int tgt = (1 << v) - 1;
        
        while (!q.isEmpty()) {
            int[] c = q.poll();
            int r = c[0], c2 = c[1], mask = c[2], en = c[3], mv = c[4];
            
            if (mask == tgt) return mv;
            if (en == 0) continue;
            
            for (int i = 0; i < 4; i++) {
                int nr = r + d[i], nc = c2 + d[i+1];
                
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] != 3) {
                    int nMask = mask;
                    int nEn = en - 1;
                    
                    if (grid[nr][nc] == 2) nEn = energy;
                    else if (grid[nr][nc] >= 10) nMask |= (1 << (grid[nr][nc] - 10));
                    
                    if (nEn > vis[nr][nc][nMask]) {
                        vis[nr][nc][nMask] = nEn;
                        q.offer(new int[]{nr, nc, nMask, nEn, mv + 1});
                    }
                }
            }
        }
        
        return -1;
    }
}