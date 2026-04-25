class Solution {
    public int maxPointsInsideSquare(int[][] pts, String s) {
        int n=pts.length;
        int[][] temp= new int[n][2];
        for(int i=0;i<n;i++){
            temp[i][0]=Math.max(Math.abs(pts[i][0]),Math.abs(pts[i][1]));
            temp[i][1]=s.charAt(i)-'a';
        }
        Arrays.sort(temp,(a,b)->Integer.compare(a[0],b[0]));
        int ans=0,i=0,c=-1;
        Set<Integer> hm= new HashSet<>();
        while(i<n && c<=temp[n-1][0]){
            int curr=0;
            c++;
            boolean fnd=false;
            while(i<n && temp[i][0]<=c){
                if(hm.contains(temp[i][1])){
                    fnd=true;
                    break;
                }
                else hm.add(temp[i][1]);
                curr++;
                i++;
            }
            if(fnd)break;
            ans+=curr;
            if(i<n){
                c=temp[i][0]-1;
            }
        }
        return ans;
    }
}