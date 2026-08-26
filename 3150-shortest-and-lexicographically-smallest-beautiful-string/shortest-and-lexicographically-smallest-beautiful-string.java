class Solution {
    public String shortestBeautifulSubstring(String s,int k) {
        int sz=999,left=0,st=0,right=0,n=s.length(),one=0;

        while(right<n){
            char ch=s.charAt(right);
            if(ch=='1')one++;

            while(left<right&&(one>k||s.charAt(left)=='0')){
                char ch2=s.charAt(left);
                if(ch2=='1')one--;
                left++;
            }

            if(one==k&&right-left+1<sz){
                sz=right-left+1;
                st=left;
            }

            right++;
        }

        if(sz==999)return "";

        String ans=s.substring(st,st+sz);

        one=0;
        for(int i=0;i<sz;i++){
            if(s.charAt(i)=='1')one++;
        }

        if(sz==n)return s;

        for(int i=sz;i<n;i++){
            if(s.charAt(i)=='1')one++;
            if(s.charAt(i-sz)=='1')one--;

            if(one==k){
                String temp=s.substring(i-sz+1,i+1);
                if(ans.compareTo(temp)>0)ans=temp;
            }
        }
        return ans;
    }
}