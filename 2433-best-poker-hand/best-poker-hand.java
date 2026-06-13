class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean fl=true;
        for(int i=0;i<suits.length;i++)if(suits[i]!=suits[0])fl=false;
        if(fl)return "Flush";
        Arrays.sort(ranks);
        for(int i=0;i<ranks.length-1;i++){
            if(i>0 && ranks[i-1]==ranks[i] && ranks[i+1]==ranks[i])return "Three of a Kind";
            else if(ranks[i+1]==ranks[i])fl=true;
        }
        if(fl)return "Pair";
        return "High Card";
    }
}