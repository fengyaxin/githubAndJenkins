package DataStructure.LinkList;

import java.util.Scanner;

public class linkList {

    /**
     * 初始化一个空链表（有头指针）
     */
    public LNode initList() {
        LNode L = new LNode(0);
        L.next = null;
        return L;
    }

    /**
     * 创建单链表（前插法）
     */
    public LNode createListF(int n) {

        Scanner reader = new Scanner(System.in);
        LNode L = initList();  //创建一个空链表（仅包含头指针）
        for (int i = 0; i < n; i++) {
            int val = reader.nextInt();
            LNode p = new LNode(val);
            p.next = L.next;
            L.next = p;
        }
        return L.next;  //返回第一个结点
    }


    /**
     * 创建单链表（后插法）
     */

    public LNode createListL(int n) {

        Scanner reader = new Scanner(System.in);
        LNode L = initList();       //L为头结点
        LNode r = L;                //r始终指向尾节点
        for (int i = 0; i < n; i++) {
            int val = reader.nextInt();
            LNode p = new LNode(val);
            p.next = null;
            r.next = p;
            r = p;
        }

        return L.next;
    }


    public static void main(String[] args) {

        linkList l1 = new linkList();
//        LNode ll = l1.createListF(3);
        LNode ll = l1.createListL(4);
        while (ll != null) {
            System.out.print(ll.data + ",");
            ll = ll.next;
        }



    }

}
