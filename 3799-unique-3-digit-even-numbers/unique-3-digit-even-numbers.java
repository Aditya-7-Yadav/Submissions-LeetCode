class Solution {
    public int totalNumbers(int[] dig) {
        Set<String> hs= new HashSet<>();
        int n=dig.length;
        for(int i=0;i<n;i++){
            char[] ch=new char[3];
            if(dig[i]==0)continue;
            ch[0]=(char)('0'+dig[i]);
            for(int j=0;j<n;j++){
                if(j==i)continue;
                ch[1]=(char)('0'+dig[j]);
                for(int k=0;k<n;k++){
                    if(k==j || k==i || dig[k]%2==1)continue;
                    ch[2]=(char)('0'+dig[k]);
                    hs.add(new String(ch));
                }
            }
        }
        return hs.size();
    }
}