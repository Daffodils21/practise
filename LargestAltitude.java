// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

// Example 1:

// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

public class LargestAltitude {
    
    public static void main(String[] args) {
        int nums[] = {-5,1,5,0,-7};
        int res = largestAltitude(nums);
        System.err.println(res);
    }
        
        public static int largestAltitude(int[] gain) {
            int ans = 0;
            int l = gain.length;
            int nums2[] = new int[l+1];
            int l2=nums2.length;
            nums2[0]=0;
            
            for(int i=0;i<l;i++)
            {
                nums2[i+1]=nums2[i]+gain[i];
                 
            }

            for(int j=0;j<l2;j++)
            {
                System.err.println(nums2[j]);
               if (nums2[j] > 0)
               {
                ans = nums2[j];
               }
               else
               {
                ans = 0;
               }
  
                
        }
         return ans;
    
}
}
