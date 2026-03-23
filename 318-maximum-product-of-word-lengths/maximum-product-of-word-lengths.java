class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        List<Set<Character>> lst = new ArrayList<>();
        int max = 0;

        for(String word : words) {
            Set<Character> set = new HashSet<>();
            lst.add(set);
            for(int i=0;i<word.length();i++){
                set.add(word.charAt(i));
            }
        }

        for(int i=0;i<n;i++){
            Set<Character> setI = lst.get(i);
            for(int j=i+1;j<n;j++){
                boolean hasc = false;
                Set<Character> setJ = lst.get(j);

                for(Character c : setI){
                    if(setJ.contains(c)){
                        hasc = true;
                        break;
                    }
                }
                if(!hasc){
                    max = Math.max(max, words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
}