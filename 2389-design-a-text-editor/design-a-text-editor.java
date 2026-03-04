import java.util.*;

class TextEditor {
    StringBuilder l;
    StringBuilder r;

    public TextEditor() {
        l=new StringBuilder();
        r=new StringBuilder();
    }
    
    public void addText(String text) {
        l.append(text);
    }
    
    public int deleteText(int k) {
        int del=Math.min(k,l.length());
        l.setLength(l.length()-del);
        return del;
    }
    
    public String cursorLeft(int k) {
        int move=Math.min(k,l.length());
        while(move-->0){
            r.append(l.charAt(l.length()-1));
            l.setLength(l.length()-1);
        }
        int start=Math.max(0,l.length()-10);
        return l.substring(start);
    }
    
    public String cursorRight(int k) {
        int mv=Math.min(k,r.length());
        while(mv>0){
            l.append(r.charAt(r.length()-1));
            r.setLength(r.length()-1);
            mv--;
        }
        int st=Math.max(0,l.length()-10);
        return l.substring(st);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */