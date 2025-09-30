//给你一个字符串 s，找到 s 中最长的 回文 子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 双指针 字符串 动态规划 👍 7744 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        //return getString1(s);
        return getString2(s);
    }
    private String getString2(String s) {
        int length = s.length();
        if(length<=1)
            return s;
        char[] chs = s.toCharArray();
        int begin=0;
        int maxLen=1;
        //初始化二维dp数组
        boolean[][] dp = new boolean[length][length];
        //长度为奇数基准
        for (int i = 0; i < length; i++) {
            dp[i][i]=true;
        }
        //长度为偶数基准
        int r=-1;
        for (int l = 0; l<length-1; l++) {
             r=l+1;
             if(chs[l]==chs[r]){
                 dp[l][r]=true;
                 //更新为2的起始位
                 if (r-l+1>maxLen) {
                     begin=l;
                     maxLen=2;
                 }
             }else {
                 dp[l][r]=false;
             }
        }
        //枚举i,j，长度为3开始
        int j=-1;
        for (int len = 3; len <=length; len++) {
            //左边界
            for (int i = 0; i <length ; i++) {
                //右边界
                j =len+i-1;
                if(j>=length)
                    break;
                if(chs[i]==chs[j] && dp[i+1][j-1]){
                    dp[i][j]=true;
                    if(len>maxLen){
                        maxLen=len;
                        begin=i;
                    }
                }else {
                    dp[i][j]=false;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }











    private String getString1(String s) {
        int max=0;
        String maxStr="";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                String maybeStr = s.substring(i,j+1);
                if (isPalindrome(maybeStr)) {
                    if(maybeStr.length()>max){
                        max=maybeStr.length();
                        maxStr=maybeStr;
                    }
                }
            }
        }
        return maxStr;
    }

    public boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left=0;
        int right=chs.length-1;
        while (left<right){
            if(chs[left]!=chs[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
