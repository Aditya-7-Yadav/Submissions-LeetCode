class Solution {
    public String smallestPalindrome(String s) {
        int[] f= new int[26];
        int ind=25;
        int pos=-1;
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
            
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<26;i++){
            if(f[i]>0){
            char ch=(char)(i+'a');
            if(f[i]%2==1){
                pos=i;
                int temp=f[pos]/2;
                while(temp>0){
                    temp--;
                    sb.append(ch);
            }
                continue;
            }
            int tempp=f[i];
            while(f[i]/2!=tempp){
                sb.append(ch);
                tempp--;
            }
            }
        }
        char ch2=(char)(pos+'a');
        if(pos>-1 && f[pos]>0){
            sb.append(ch2);
        }
        for(int i=25;i>=0;i--){
            if(f[i]>0){
            char ch=(char)(i+'a');
            int temp=f[i];
            if(f[i]%2==1){
                pos=i;
                int tempp=f[pos]/2;
                while(tempp>0){
                    tempp--;
                    sb.append(ch);
            }
                continue;
            }
            int tempp=f[i];
            while(f[i]/2!=tempp){
                sb.append(ch);
                tempp--;
            }
            }
        }
        return sb.toString();
    }
}