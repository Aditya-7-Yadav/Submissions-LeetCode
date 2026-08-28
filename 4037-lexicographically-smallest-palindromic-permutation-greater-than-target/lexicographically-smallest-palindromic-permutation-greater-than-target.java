class Solution {
    public String lexPalindromicPermutation(String s,String target) {
        int n=s.length(),half=n/2;
        int[] f=new int[26];

        for(int i=0;i<n;i++)f[s.charAt(i)-'a']++;

        int odd=0,mid=-1;
        for(int i=0;i<26;i++){
            if((f[i]&1)==1){
                odd++;
                mid=i;
            }
        }

        if(odd>1)return "";

        for(int i=0;i<26;i++)f[i]/=2;

        char[] ans=new char[n];
        int pos=0;

        while(pos<half){
            int x=target.charAt(pos)-'a';

            if(f[x]==0)break;

            ans[pos]=target.charAt(pos);
            f[x]--;
            pos++;
        }

        if(pos==half){
            if(mid!=-1)ans[half]=(char)('a'+mid);

            for(int i=0;i<half;i++)
                ans[n-1-i]=ans[i];

            String res=new String(ans);

            if(res.compareTo(target)>0)return res;
        }

        while(true){
            if(pos<half){
                int x=target.charAt(pos)-'a'+1;

                while(x<26&&f[x]==0)x++;

                if(x<26){
                    ans[pos]=(char)('a'+x);
                    f[x]--;

                    int idx=pos+1;

                    for(int c=0;c<26;c++){
                        while(f[c]>0){
                            ans[idx++]=(char)('a'+c);
                            f[c]--;
                        }
                    }

                    if(mid!=-1)ans[half]=(char)('a'+mid);

                    for(int i=0;i<half;i++)
                        ans[n-1-i]=ans[i];

                    return new String(ans);
                }
            }

            if(pos==0)return "";

            pos--;
            f[target.charAt(pos)-'a']++;
        }
    }
}