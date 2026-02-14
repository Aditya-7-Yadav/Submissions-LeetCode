class Solution {
    public int distinctPoints(String s, int k) {
        Set<List<Integer>> hs = new HashSet<>();
        int n=s.length();
        if(k==n)return 1;

        int netx=0,nety=0;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='U')nety++;
            else if(c=='D')nety--;
            else if(c=='R')netx++;
            else netx--;
        }

        int wx=0,wy=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='U')wy++;
            else if(c=='D')wy--;
            else if(c=='R')wx++;
            else wx--;
        }

        for(int i=0;i+k<=n;i++){

            int fx=netx-wx;
            int fy=nety-wy;
            hs.add(Arrays.asList(fx,fy));

            if(i+k==n)break;

            char left=s.charAt(i);

            if(left=='U')wy--;
            else if(left=='D')wy++;
            else if(left=='R')wx--;
            else wx++;

            char right=s.charAt(i+k);
            if(right=='U')wy++;
            else if(right=='D')wy--;
            else if(right=='R')wx++;
            else wx--;
        }

        return hs.size();
    }
}
