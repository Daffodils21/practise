// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?

 

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4
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