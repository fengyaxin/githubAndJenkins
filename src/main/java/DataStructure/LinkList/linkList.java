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

        return L;
    }

    /**
     * 按序号查找（返回链表第i个元素的值）
     */
    public int getElem(LNode L, int i) {
        LNode p = L.next;     //L为头结点，p为第一个结点
        int j = 1;
        while (p != null && j < i) {
            p = p.next;
            j++;
        }
        if (p == null || j > i) {
            return 0;   //有待考虑异常返回情况
        }
        return p.data;
    }

    /**
     * 按值查找,返回其在链表中的“位置”
     */
    public int locateElem(LNode L, int e) {
        LNode p = L.next;
        int j = 1;
        while (p != null && p.data != e) {
            p = p.next;
            ++j;         //考虑异常情况
        }
        return j;
    }

    /**
     * 插入：在第i个结点前插入一个值为e的结点
     */
    public LNode insertList(LNode L, int i, int e) {
        LNode p =L.next;
        LNode s = new LNode(e);
        int j=1;
        while(p!=null&&j<(i-1)){
            p=p.next;
            j++;
        }
        s.next=p.next;
        p.next=s;
        return L;
    }

    /**删除：删除指定位置的结点*/
    public LNode deleteList(LNode L,int i){
        LNode p = L.next;
        LNode d = new LNode(0);
        int j =1;
        while(p!=null&&j<(i-1)){
            p=p.next;
            j++;
        }
        d=p.next;
        p.next=p.next.next;
        System.out.println("删除的值为："+d.data);
        return L;
    }


    public static void main(String[] args) {

        linkList list = new linkList();  //new一个linkList对象
        //   LNode L1 = list.createListF(4);  //前插法创建一个链表L1，有4个节点
        LNode L2 = list.createListL(5);   //后插法创建一个链表L2，有3个节点

        //  int e = list.getElem(L1,2);    //查找链表第二个节，并返回其值

        //int loc = list.locateElem(L2, 2); //查找链表中值为2的结点，并返回其所处“位置”

        // System.out.println("*********"+e);
        //System.out.println(loc);
      //  LNode newL2 = list.insertList(L2,3,0);
//        LNode p =newL2.next;
//        while(p!=null){
//            System.out.println(p.data);
//            p=p.next;
//        }
        LNode p = list.deleteList(L2,3);
        LNode a =p.next;
        while(a!=null){
            System.out.println(a.data);
            a=a.next;
        }


    }

}
