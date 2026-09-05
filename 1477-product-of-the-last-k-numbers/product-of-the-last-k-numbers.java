class ProductOfNumbers {
    ArrayList<Integer> al= new ArrayList<>();
     ArrayList<Integer> cnt= new ArrayList<>();
     int zero=0;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        
        if(num==0){
            if(al.size()==0)al.add(1);
            else al.add(1);
            zero++;
        }
        else{
            if(al.size()==0)al.add((num));
           else al.add((num) * al.get(al.size()-1));
        }
        cnt.add(zero);
    }
    
    public int getProduct(int k) {
        int ans=0,n=al.size();
        if(k>=n){
            if(cnt.get(n-1)>0)return 0;
            long anss=al.get(n-1);
            return (int)anss;
        }
        if(cnt.get(n-1)-cnt.get(n-1-k)>0)return 0;
        ans=(int)(al.get(n-1)/al.get(n-1-k));
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */