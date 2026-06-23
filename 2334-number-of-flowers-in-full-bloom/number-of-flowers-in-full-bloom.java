class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n=flowers.length,m=people.length;
        int[] st= new int[n];
        int[] en= new int[n];

        for(int i=0;i<n;i++){
            st[i]=flowers[i][0];
            en[i]=flowers[i][1];
        }

        Arrays.sort(st);
        Arrays.sort(en);

        int[] ans= new int[m];

        for(int i=0;i<m;i++){
            int s=upper(st,people[i]);
            int e=lower(en,people[i]);
            ans[i]=s-e;
        }

        return ans;
    }

    int upper(int[] arr,int t){
        int l=0,r=arr.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=t)l=mid+1;
            else r=mid;
        }
        return l;
    }

    int lower(int[] arr,int t){
        int l=0,r=arr.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<t)l=mid+1;
            else r=mid;
        }
        return l;
    }
}