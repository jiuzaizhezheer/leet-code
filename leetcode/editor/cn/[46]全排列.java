//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
//
// Related Topics 数组 回溯 👍 3162 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //要返回的List
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //临时List
        List<Integer> tempList = new ArrayList<Integer>();
        for (int num : nums) {
            tempList.add(num);
        }
        int length = nums.length;
        //递归函数
        dfs(res,tempList,length,0);
        return res;
    }
    private void dfs(List<List<Integer>> res,
                     List<Integer> tempList,
                     int length,
                     int first){
        if(first == length){
            res.add(new ArrayList<Integer>(tempList));
        }else{
        for (int i = first; i < length; i++) {
            Collections.swap(tempList, first, i);
            //调用递归
            dfs(res, tempList, length, first + 1);
            //回溯法精髓，恢复现场
            Collections.swap(tempList, first, i);
        }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
