
public class Le_045_Jump_Game_II {
	public int jump(int[] nums) {
        if(nums == null || nums.length <= 1){  // test case: [0]
            return 0;
        } 
        
        int n = nums.length;
        int fastest = 0;       // 下一次可以到达的最远距离
        int currentReach = 0;  // 当前可以到达的最远距离
        int step = 0;
        
        for(int i = 0; i < n; i++){
            fastest = Math.max(fastest, i + nums[i]);
            if(currentReach == i){
                currentReach = fastest;
                step++;
            }
            if(currentReach == n - 1){
                break;
            }
        }
        
        return step;
    }
}
