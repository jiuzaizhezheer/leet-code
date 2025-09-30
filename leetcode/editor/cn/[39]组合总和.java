//给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的
// 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。 
//
// candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
//
// 对于给定的输入，保证和为 target 的不同组合数少于 150 个。 
//
// 
//
// 示例 1： 
//
// 
//输入：candidates = [2,3,6,7], target = 7
//输出：[[2,2,3],[7]]
//解释：
//2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
//7 也是一个候选， 7 = 7 。
//仅有这两种组合。 
//
// 示例 2： 
//
// 
//输入: candidates = [2,3,5], target = 8
//输出: [[2,2,2,2],[2,3,3],[3,5]] 
//
// 示例 3： 
//
// 
//输入: candidates = [2], target = 1
//输出: []
// 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 2 <= candidates[i] <= 40 
// candidates 的所有元素 互不相同 
// 1 <= target <= 40 
// 
//
// Related Topics 数组 回溯 👍 3079 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //需要重复操作的列表
        List<Integer> combine = new ArrayList<Integer>();
        //调用递归函数
        dfs(ans,combine,candidates,target, 0);

        return ans;
    }
    private void dfs(List<List<Integer>> ans, List<Integer> combine, int[] candidates, int target, int index){
        if(index == candidates.length) return;
        //相当于和为target时满足条件
        if (target == 0){
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        //重复选择当前元素
        if(target - candidates[index] >= 0){
                combine.add(candidates[index]);
                dfs(ans,combine,candidates,target - candidates[index],index);
                //回溯
                combine.remove(combine.size() - 1);
        };
        //选择下一个元素
        dfs(ans,combine,candidates,target,index+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
