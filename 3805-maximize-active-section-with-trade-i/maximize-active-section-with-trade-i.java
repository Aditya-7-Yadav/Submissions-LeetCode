class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ans=0,n=s.length(),c1=-1,c2=-1,i=0;
        char[]  ch=s.toCharArray();
        List<Integer> al= new ArrayList<>();
        while(i<n){
            if(ch[i]=='1'){
                int temp=0;
                while(i<n && ch[i]=='1'){
                    i++;
                    temp++;
                }
                al.add(temp);
                ans+=temp;
            }
            else{
                int temp=0;
                while(i<n && ch[i]=='0'){
                    i++;
                    temp--;
                }
                al.add(temp);
            }
        }
        if(al.size()<3)return ans;
        i=0;
        n=al.size();
        int tempp=0;
        while(i<n-2){
            if(al.get(i)<0){
                int temp=0;
                temp-=al.get(i);
                temp-=al.get(i+2);
                // if(i>0)temp+=al.get(i-1);
                // if(i<n-3)temp+=al.get(i+3);
                tempp=Math.max(tempp,temp);
            }
            i++;
        }
        
        return ans+tempp;
    }
}