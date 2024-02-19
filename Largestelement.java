import java.util.*; 
class Largestelement {

       public static void main(String[] args) {
      int k = 2;
      int num[] = {3,2,1,5,6,4};
      int a =  findKthLargest(num,k);
      System.out.println(a);
    }
    


public static int findKthLargest(int[] nums, int k) {
        
int l = nums.length; 
 Arrays.sort(nums);
 int s = l-k; 
return nums[s];
}
}