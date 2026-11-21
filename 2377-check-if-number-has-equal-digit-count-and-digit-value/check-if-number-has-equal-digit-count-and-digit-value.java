class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        int[] f= new int[10];
        for(int i=0;i<n;i++)f[Integer.parseInt(num.charAt(i)+"")]++;
        for(int i=0;i<n;i++)if(f[i]!=Integer.parseInt(""+num.charAt(i)))return false;
        return true;
    }
}