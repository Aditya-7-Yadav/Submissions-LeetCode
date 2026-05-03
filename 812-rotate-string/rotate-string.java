class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        StringBuilder sb= new StringBuilder(goal);
        sb.append(goal);
        return sb.toString().contains(s);
    }
}