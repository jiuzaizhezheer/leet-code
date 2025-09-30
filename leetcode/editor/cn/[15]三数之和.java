//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != 
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 双指针 排序 👍 7569 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int length = nums.length;
        int target=0;
        int j = 0;
        int k = 0;
        int temp = 0;
        //规定i<j<k，nums[i]为target
        for (int i = 0; i < length-2; i++) {
            if((i>=1) && (nums[i] ==nums[i-1])){
                //去重，直接跳过
                continue;
            }
            target=nums[i];
            //转化为两数之和问题,排序，头尾双指针移动
            j=i+1;
            k=length-1;
            //剪枝策略
            if(target+nums[j]+nums[j+1]>0){
                break;
            }
            if(target+nums[k]+nums[k-1]<0){
                continue;
            }
            while (j<k){
                temp = target + nums[j] + nums[k];
                if(temp == 0){
                    //添加这个三元组
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    while ((j<k) && nums[j] == nums[j-1]){
                        j++;
                    }
                    k--;
                    while ((j<k) && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                if(temp < 0){
                    j++;
//                    while ((j<k) && nums[j] == nums[j-1]){
//                        j++;
//                    }
                }
                if(temp > 0){
                    k--;
//                    while ((j<k) && nums[k] == nums[k+1]){
//                        k--;
//                    }
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
