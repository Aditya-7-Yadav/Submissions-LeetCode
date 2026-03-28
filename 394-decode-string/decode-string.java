import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums=new Stack<>();
        Stack<String> strs=new Stack<>();
        String curr="";
        int num=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                nums.push(num);
                strs.push(curr);
                num=0;
                curr="";
            }
            else if(c==']'){
                int k=nums.pop();
                String prev=strs.pop();
                String temp="";
                for(int j=0;j<k;j++) temp+=curr;
                curr=prev+temp;
            }
            else{
                curr+=c;
            }
        }
        return curr;
    }
}