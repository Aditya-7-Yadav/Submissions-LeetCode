class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       HashMap<Integer,Integer> hm2=new HashMap<>();
       int[] ans=new int[A.length];
       int count=0;
       for(int i=0;i<A.length;i++){
            
            
            if(hm.getOrDefault(B[i],0)>0){
                hm.put(B[i],hm.get(B[i])-1);
                count++;
            }
            else hm2.put(B[i],hm2.getOrDefault(B[i],0)+1);
            if(hm2.getOrDefault(A[i],0)>0){
                hm2.put(A[i],hm2.get(A[i])-1);
                count++;
            }
            else hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            ans[i]=count;
    }
    return ans;
    }
}