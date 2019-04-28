package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Test21 {
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution21 {
    @Test
    public void test(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);

        System.out.println(l1.val);
        System.out.println(l1.next.val);
        System.out.println(l1.next.val);
    }



    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    /**
     * ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ�
     *
     * ʾ����
     *
     * ���룺1->2->4, 1->3->4
     * �����1->1->2->3->4->4
     * ˼·��
     *      ����˳��ȡ�����������б��ֵ���бȽ�
     *      ����Сֵ������µ��б�
     *      ���һ������Ϊ�վͽ���һ������ֱ��ʹ��Next����Ҫ��������������
     * */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode listNode = cur;
        while (l1 != null && l2 != null){
            if(l1.val > l2.val){
                listNode.next = l2;
                listNode = listNode.next;
                l2 = l2.next;
            }else {
                listNode.next = l1;
                listNode = listNode.next;
                l1 = l1.next;
            }
        }

        //�������һ������Ϊ�� ֱ���໥����
        if(l1 == null){
            listNode.next = l2;
        }
        if(l2 == null){
            listNode.next = l1;
        }

        return cur.next;
    }
}