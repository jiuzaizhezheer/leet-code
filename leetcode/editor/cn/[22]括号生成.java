//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
//
// Related Topics 字符串 动态规划 回溯 👍 3895 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> result = new ArrayList<>();
    StringBuilder str = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        //在第i个位置选"("或者是")"
        dfs(0,0,n);
        return result;
    }
    public void dfs(int open, int close, int n){
        if(str.length() == n*2){
            result.add(str.toString());
            return;
        }
        if(open < n){
            str.append("(");
            dfs(open+1,close,n);
            //还原现场
            str.deleteCharAt(str.length()-1);
        }
        if(close < open){
            str.append(")");
            dfs(open,close+1,n);
            //还原现场
            str.deleteCharAt(str.length()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
