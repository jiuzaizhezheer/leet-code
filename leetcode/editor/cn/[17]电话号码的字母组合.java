//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
//
// Related Topics 哈希表 字符串 回溯 👍 3096 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits.length() == 0){
            return result;
        }
        Map<Character, String> phoneMap = new HashMap();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");
        backtrack(result,phoneMap,digits,0,new StringBuilder());
        return result;
    }
    private void backtrack(List<String> result,
                           Map<Character, String> phoneMap,
                           String digits,
                           int index,
                           StringBuilder str){
     if(index == digits.length()){
         //若索引与长度相等，说明已经遍历完，需要添加到list
         result.add(str.toString());
     }else {
         //没有，执行添加逻辑
         char ch = digits.charAt(index);
         String s = phoneMap.get(ch);
         int len = s.length();
         for (int i = 0; i < len; i++) {
             str.append(s.charAt(i));
             backtrack(result,phoneMap,digits,index+1,str);
             //恢复原状
             str.deleteCharAt(index);
         }
      }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
