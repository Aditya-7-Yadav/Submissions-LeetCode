class Solution {
    public int[][] rotateGrid(int[][] g, int k) {

        int m=g.length,n=g[0].length;

        for(int l=0;l<Math.min(m,n)/2;l++){

            ArrayList<Integer> a=new ArrayList<>();
            int t=l,b=m-l-1;
            int le=l,r=n-l-1;

            for(int j=le;j<=r;j++) a.add(g[t][j]);
            for(int i=t+1;i<b;i++) a.add(g[i][r]);
            for(int j=r;j>=le;j--) a.add(g[b][j]);
            for(int i=b-1;i>t;i--) a.add(g[i][le]);

            int sz=a.size();
            int rot=k%sz;

            ArrayList<Integer> x=new ArrayList<>();

            for(int i=0;i<sz;i++)x.add(a.get((i+rot)%sz));

            int id=0;

            for(int j=le;j<=r;j++) g[t][j]=x.get(id++);
            for(int i=t+1;i<b;i++) g[i][r]=x.get(id++);
            for(int j=r;j>=le;j--) g[b][j]=x.get(id++);
            for(int i=b-1;i>t;i--) g[i][le]=x.get(id++);
        }

        return g;
    }
}