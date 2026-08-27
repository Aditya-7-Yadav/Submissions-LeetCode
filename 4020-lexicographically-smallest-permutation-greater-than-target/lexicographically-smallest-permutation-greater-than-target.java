class Solution {
    public String lexGreaterPermutation(String s,String tar) {
        int[] f1=new int[26];
        int n=s.length();

        for(int i=0;i<n;i++){
            f1[s.charAt(i)-'a']++;
        }

        StringBuilder sb=new StringBuilder();
        int i=0;

        while(i<n&&f1[tar.charAt(i)-'a']>0){
            f1[tar.charAt(i)-'a']--;
            sb.append(tar.charAt(i));
            i++;
        }

        if(i==n){
            i=n-1;
            while(i>=0){
                f1[tar.charAt(i)-'a']++;
                sb.deleteCharAt(sb.length()-1);

                int temp=tar.charAt(i)-'a'+1;

                while(temp<26&&f1[temp]==0)temp++;

                if(temp<26){
                    sb.append((char)(temp+'a'));
                    f1[temp]--;

                    for(int j=0;j<26;j++){
                        while(f1[j]>0){
                            sb.append((char)(j+'a'));
                            f1[j]--;
                        }
                    }

                    return sb.toString();
                }

                i--;
            }

            return "";
        }

        int temp=tar.charAt(i)-'a'+1;

        while(temp<26&&f1[temp]==0)temp++;

        if(temp==26){
            i--;

            while(i>=0){
                f1[tar.charAt(i)-'a']++;
                sb.deleteCharAt(sb.length()-1);

                temp=tar.charAt(i)-'a'+1;

                while(temp<26&&f1[temp]==0)temp++;

                if(temp<26){
                    sb.append((char)(temp+'a'));
                    f1[temp]--;

                    for(int j=0;j<26;j++){
                        while(f1[j]>0){
                            sb.append((char)(j+'a'));
                            f1[j]--;
                        }
                    }

                    return sb.toString();
                }

                i--;
            }

            return "";
        }

        sb.append((char)(temp+'a'));
        f1[temp]--;

        for(int j=0;j<26;j++){
            while(f1[j]>0){
                sb.append((char)(j+'a'));
                f1[j]--;
            }
        }

        return sb.toString();
    }
}