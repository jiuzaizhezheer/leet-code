//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics 回溯 👍 1786 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(n,k);
        return ans;
    }
    private void dfs(int n,int k){
        //剪枝策略
        if(temp.size() + n < k) return;
        //添加
        if(temp.size() == k){
            ans.add(new ArrayList<Integer>(temp));
        }else{
            for (int i = n; i >=1 ; i--) {
                temp.add(i);
                dfs(i-1,k);
                //每返回一层清除一个
                temp.remove(temp.size()-1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
