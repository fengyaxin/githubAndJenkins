/**
 * 拓展：
 * 如果链表中的数字不是按逆序存储的呢？例如：
 *
 (3→4→2)+(4→6→5)=8→0→7

 * */

public class addTwoNum {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode pre;

        ListNode(int x) {
            val = x;
        }
    }

        public static  ListNode addNums(ListNode l1, ListNode l2) {

            ListNode p = l1;
            ListNode q = l2;
            ListNode curr = null;
            int carry = 0;

            while (p.pre!= null || q.pre!= null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = x + y + carry;
                carry = sum / 10;
                ListNode node = new ListNode(sum % 10);
                if (curr == null) {
                    curr = node;
                } else {
                    curr.pre = node;
                    curr.pre.next = curr;
                    curr = curr.pre;
                }
                if (p.pre != null) p = p.pre;
                if (q.pre != null) q = q.pre;
            }

            if (carry > 0) {
                curr.pre = new ListNode(carry);
                curr.pre.next = curr;
                curr = curr.pre;

            }

            return curr;

        }

    private static ListNode initListNo(int[] values) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode p = head;
        for (int i=0;i<values.length;i++) {
            ListNode list1 = new ListNode(values[i]);
            p.next=list1;
            list1.pre = p;
            p=p.next;
        }
        tail = p;
        return tail;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{1};
        int[] arr2 = new int[]{2};
        ListNode l1 = initListNo(arr1);
        ListNode l2 = initListNo(arr2);
        ListNode res = addNums(l1,l2);
        while (res!=null){
            System.out.println(res.val+"->");
            res = res.next;
        }

    }


    }


