class Pair{
    int i; int n;
    Pair(int i, int n){
        this.i=i;
        this.n=n;
    }
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len=score.length;
        String[] s=new String[len];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a1,a2)->(a2.n-a1.n));
        for(int i=0;i<len;i++){
            pq.add(new Pair(i, score[i]));
        }
        for(int i=0;i<len;i++){
            Pair tem=pq.poll();
            int index=tem.i;
            int sc=tem.n;
            if(i==0){
                s[index]="Gold Medal";
            }
             else if(i==1){
                s[index]="Silver Medal";
            }
             else if(i==2){
                s[index]="Bronze Medal";
            }
            else{
                s[index]=String.valueOf(i+1);
            }
        }
        return s;
    }
}