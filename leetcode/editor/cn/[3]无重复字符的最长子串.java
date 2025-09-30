//给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
//
// Related Topics 哈希表 字符串 滑动窗口 👍 10899 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //哈希容器用于判断是否重复
        Set<Character> hashSet = new HashSet<Character>();
        int length = s.length();
        //初始最大长度
        int max = 0;
        char[] chars = s.toCharArray();
        //初始化左端点
        int left=0;
        //右端点
        for (int right = 0; right < length; right++) {
            char aChar = chars[right];
            //若包含重复元素，则从头开始删除，知道没有重复元素位置
            while (hashSet.contains(aChar)){
                //删除
                hashSet.remove(chars[left]);
                //指针向后移动
                left++;
            }
            hashSet.add(aChar);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
