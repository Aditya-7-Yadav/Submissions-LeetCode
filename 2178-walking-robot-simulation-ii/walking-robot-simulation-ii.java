class Robot {
    int wid=0,hei=0;
    int[] curr=new int[2];
    public Robot(int wid, int hei) {
        curr[0]=0;
        this.wid=wid;
        this.hei=hei;
        curr[1]=hei-1;
    }
    int dir=0;
    public void step(long num) {
        num=(num)%(2L*(wid+hei)-4L);
        if(num==0 && ((curr[0]==0 && curr[1]==0 && dir==3) || (curr[0]==0 && curr[1]==hei-1 && dir==0) || (curr[0]==wid-1 && curr[1]==0 && dir==2) || (curr[1]==hei-1 && curr[0]==wid-1 && dir==1)))dir=(dir-1+4)%4;
        while(num>0){
            if(dir==0){
                curr[0]++;
                if(curr[0]>=wid){
                    curr[0]--;
                    dir=(dir+1)%4;
                    num++;
                }
            }
            else if(dir==1){
                curr[1]--;
                if(curr[1]<0){
                    curr[1]++;
                    dir=(dir+1)%4;
                    num++;
                }
            }
            else if(dir==2){
                curr[0]--;
                if(curr[0]<0){
                    curr[0]++;
                    num++;
                    dir=(dir+1)%4;
                }
            }
            else{
                curr[1]++;
                if(curr[1]>=hei){
                    curr[1]--;
                    num++;
                    dir=(dir+1)%4;
                }
            }
            num--;
        }
    }
    
    public int[] getPos() {
        int[]ans= new int[2];
        ans[0]=curr[0];
        ans[1]=hei-curr[1]-1;
        return ans;
    }
    
    public String getDir() {
        if(dir==0)return "East";
        else if(dir==1)return "North";
        else if(dir==2)return "West";
        return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */