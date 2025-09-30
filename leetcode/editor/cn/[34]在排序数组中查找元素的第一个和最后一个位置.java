//给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics 数组 二分查找 👍 3088 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;

        if(nums == null || length == 0){
            return new int[]{-1,-1};
        }

        int l = 0;
        int r = length-1;

        //找左边界
        int leftIndex = getIndex(nums, target, l, r, true);//true找左边
        //找右边界
        int rightIndex = getIndex(nums, target, l, r, false);//false找右边

        return new int[]{leftIndex,rightIndex};


    }

    private static int getIndex(int[] nums, int target, int l, int r, boolean flag) {
        int result = -1;
        while (l <= r){
            int mid = (l + r)/2;
            int num = nums[mid];
            if(target == num){
                //更新result值
                result = mid;
                //继续向左寻找
                if(flag){
                   r = mid-1;
                }else {
                 //继续向右寻找
                    l = mid +1;
                }
            }
            else if( target < num){
                r = mid - 1;
            }else {
               l = mid + 1;
            }
        }
      return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
