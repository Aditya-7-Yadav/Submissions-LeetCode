class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        List<Character> al1= new ArrayList<>();
        List<Character> al2= new ArrayList<>();
        List<Character> al3= new ArrayList<>();
        List<Character> al4= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                al1.add(s1.charAt(i));
                al3.add(s2.charAt(i));
            }
            else{
                al2.add(s1.charAt(i));
                al4.add(s2.charAt(i));
            }
        }
        Collections.sort(al1);
        Collections.sort(al2);
        Collections.sort(al3);
        Collections.sort(al4);
        for(int i=0;i<al1.size();i++){
            if(al1.get(i)!=al3.get(i))return false;
        }
        for(int i=0;i<al2.size();i++){
            if(al2.get(i)!=al4.get(i))return false;
        }
        return true;
    }
}