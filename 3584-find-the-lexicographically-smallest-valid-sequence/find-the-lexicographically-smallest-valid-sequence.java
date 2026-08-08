class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[] suf=new int[m];
        Arrays.fill(suf,-1);

        int j=m-1;

        for(int i=n-1;i>=0&&j>=0;i--){
            if(word1.charAt(i)==word2.charAt(j)){
                suf[j]=i;
                j--;
            }
        }

        int[] ans=new int[m];
        j=0;
        int k=0;
        boolean changed=false;

        for(int i=0;i<n&&j<m;i++){
            if(word1.charAt(i)==word2.charAt(j)){
                ans[k++]=i;
                j++;
            }
            else if(!changed&&(j==m-1||suf[j+1]>i)){
                ans[k++]=i;
                j++;
                changed=true;
            }
        }

        if(j<m)return new int[0];
        return ans;
    }
}