class Solution {
    public boolean asteroidsDestroyed(int masss, int[] ast) {
        Arrays.sort(ast);
        long mass=masss;
        int i=0;
        while(i<ast.length && ast[i]<=mass){
            mass+=ast[i];
            i++;
        }
        return i==ast.length ;
    }
}