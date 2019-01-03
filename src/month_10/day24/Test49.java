package month_10.day24;

public class Test49 {

    public static void main(String[] args) {
        int[] data = new int[]{3,1,3,4,2};
        Solution03 s3 = new Solution03();
        int res = s3.findDuplicate(data);
        System.out.println(res);
    }
}

class Solution03 {

    public int findDuplicate(int[] nums) {
        int high=nums.length-1;
        int low=0;

        while(high>low){
            int mid=(high+low)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid)
                    count++;
            }
            if(count>mid)
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
}