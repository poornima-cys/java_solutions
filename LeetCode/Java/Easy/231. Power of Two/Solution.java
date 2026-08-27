// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n==1)return true;
//         if(n==0 || n%2==1){
//             return false;
//         }
//         if(n==Integer.MAX_VALUE || n==Integer.MIN_VALUE)return false;
//         return (n&(n-1))==0;
//     }
// }
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
