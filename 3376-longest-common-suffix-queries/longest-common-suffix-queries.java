class Solution {

    class TrieNode{
        TrieNode[] child=new TrieNode[26];
        int idx=-1;
    }

    TrieNode root=new TrieNode();
    String[] wordsContainer;

    boolean better(int a,int b){
        if(b==-1)return true;

        if(wordsContainer[a].length()<wordsContainer[b].length())
            return true;
        if(wordsContainer[a].length()==wordsContainer[b].length()&&a<b)
            return true;

        return false;
    }

    void insert(String s,int index){

        TrieNode node=root;

        if(better(index,node.idx))
            node.idx=index;

        for(int i=s.length()-1;i>=0;i--){

            int c=s.charAt(i)-'a';

            if(node.child[c]==null)
                node.child[c]=new TrieNode();
            node=node.child[c];

            if(better(index,node.idx))
                node.idx=index;
        }
    }

    int search(String s){

        TrieNode node=root;

        for(int i=s.length()-1;i>=0;i--){
            int c=s.charAt(i)-'a';
            if(node.child[c]==null)
                break;
            node=node.child[c];
        }

        return node.idx;
    }

    public int[] stringIndices(String[] wordsContainer,String[] wordsQuery) {
        this.wordsContainer=wordsContainer;
        for(int i=0;i<wordsContainer.length;i++)
            insert(wordsContainer[i],i);
        int[] ans=new int[wordsQuery.length];

        for(int i=0;i<wordsQuery.length;i++)
            ans[i]=search(wordsQuery[i]);

        return ans;
    }
}