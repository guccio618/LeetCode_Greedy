
public class Le_055_Jump_Game {
	public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        
        int fastest = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            fastest = Math.max(fastest, i + nums[i]);
            if(fastest >= n - 1){
                return true;
            } else if(fastest == i){
                return false;
            }
        }
        
        return false;
	}
}	
