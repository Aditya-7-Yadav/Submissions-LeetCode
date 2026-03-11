class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int ans=0,bits=0,copy=n;
        while(n>0){
            ans=ans<<1;
            int temp=n&1;
            if(temp==0)ans+=1;
            n=n>>1;
            bits++;
        }
        int anss=0;
        for(int i=0;i<bits;i++){
            anss=anss<<1;
            anss+=ans&1;
            ans=ans>>1;
        }
        return anss;
    }
}