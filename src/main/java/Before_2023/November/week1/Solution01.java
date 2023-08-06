package Before_2023.November.week1;

/** Solution01 : Add Two Numbers
 *  문제 유형 : NodeList
 *  출처 : LeetCode
 *  날짜 : 2021-11-04
 */
public class Solution01 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode node = answer;


        System.out.println(l1.val);
        System.out.println(l2.val);
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // 해당 노드에 들어갈 값
            carry = sum / 10;
            // 10이 넘었을때 다음 노드로 넘길 값
            sum %= 10;

            node.next = new ListNode(sum);
            node = node.next;

            System.out.println(node.val);
            System.out.println(l1);
            System.out.println(l2);
        }
        if(carry > 0) {
            node.next = new ListNode(carry);
        }



        return answer.next;
    }

    public static void main(String[] args) {
        ListNode var1 = new ListNode();
        ListNode var2 = new ListNode();

        var1.val = 243;
        var2.val = 564;


        addTwoNumbers(var1, var2);

    }
}

