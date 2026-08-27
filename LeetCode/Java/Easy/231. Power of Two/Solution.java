class Solution {
  // int i=2;
    public boolean check(int n,int i){
        if(i>n){
            return false;
        }
        if(i== n){
            return true;
        }
        return check(n, i<<1);
    }
    public boolean isPowerOfTwo(int n) {
         if(n==1){
            return true;
        }
        if(n%2==1 || n==0){
            return false;
        }
       
        return check(n,2);
    }
}