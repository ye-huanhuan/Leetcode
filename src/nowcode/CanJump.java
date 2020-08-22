package nowcode;

public class CanJump {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        CanJump cj = new CanJump();
        System.out.println(cj.canJump(nums));
    }
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        boolean[] canJumps = new boolean[nums.length];
        for(int i=nums.length - 1; i>=0; i--) {
            if(nums[i] + i >= nums.length - 1) {
                canJumps[i] = true;
            } else {
                boolean flag = false;
                for(int j=i+1; j<i+1+nums[i] && j<canJumps.length; j++) {
                    if(canJumps[j]) {
                        flag = true;
                        break;
                    }
                }
                canJumps[i] = flag;
            }
        }
        return canJumps[0];
    }

    public boolean canJump02(int[] nums) {
        if(nums.length < 2) {
            return true;
        }
        int maxDist = nums[0];
        for(int i=1; i< nums.length; i++) {
            //只有当maxDist到达当前位置才有可能更新
            if(i <= maxDist){
                maxDist = Math.max(maxDist, nums[i] + i);
            } else {
                break;
            }
        }
        return maxDist >= nums.length - 1;
    }
}
