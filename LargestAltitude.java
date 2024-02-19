import java.util.Arrays;

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
