package Practice;

/**
 * @ClassName Singlelianbiao
 *完成单向链表的基本操作：初始化，插入，删除等
 **/
public class Singlelianbiao {

/**定义链表的结点*/
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

/**初始化空链表*/
public static ListNode initListNode(){
    ListNode head = new ListNode(0);
    head.next = null;
    return head;
}

/**链表中插入结点（头插法）*/
public static ListNode headInsertNode(int a){
    ListNode L= new ListNode(0);
    ListNode s = new ListNode(a);

    s.next = L.next;
    L.next = s;

    return L.next;
}

/**链表中插入结点（尾插法）*/
public ListNode tailInsertNode(){

    return null ;
}

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1
    }

}
