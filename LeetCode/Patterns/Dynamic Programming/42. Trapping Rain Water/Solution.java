class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int a[]=new int[len];
        int arr[]=new int[len];
       int max1=0;
       int max2=0;
       int count=0;
       for(int i=0;i<len;i++){
        max1=Math.max(max1,height[i]);
        a[i]=max1;
       }
       for(int i=len-1;i>=0;i--){
        max2=Math.max(max2,height[i]);
        arr[i]=max2;
       }
       for(int i=0;i<height.length;i++){
        count=count+Math.min(a[i],arr[i])-height[i];
       }
      // System.out.println(Arrays.toString(a));
     // System.out.println(Arrays.toString(arr));
      return count;
    }
}