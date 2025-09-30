//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// Related Topics 链表 双指针 👍 3152 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNthFromEnd1(head, n);
        //return removeNthFromEnd2(ListNode head, int n);
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        //构建虚拟节点
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        //计算当前链表长度
        int length = -1;
        while (dummy != null){
            length++;
            dummy=dummy.next;
        }
        //要删除节点的位置 = length-n+1
        //要修改指针节点的位置 = length-n
        int index = length-n;
        //构建虚拟节点
        ListNode result = new ListNode(-1);
        result.next=head;
        ListNode temp = result;
        for (int i = 1; i <= index; i++) {
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return result.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
