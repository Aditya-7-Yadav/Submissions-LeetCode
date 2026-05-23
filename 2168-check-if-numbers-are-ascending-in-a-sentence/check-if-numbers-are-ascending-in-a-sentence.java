class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr= s.split(" ");
        int curr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].matches("\\d+")){
                int n = Integer.parseInt(arr[i]);
                if(n<=curr)return false;
                curr=n;
}
        }
        return true;
    }
}