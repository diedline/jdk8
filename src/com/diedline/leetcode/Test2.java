package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Test2 {
}


/**
 * �������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢
 * һλ ���֡���������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
 * �����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
 */
class Solution {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }

   //�ⷨ1������ÿ�μ����λ�����
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //�����ж�l1,l2�Ƿ�Ϊ��
        if(l1 == null){
            return l2;
        }if (l2 == null){
            return l1;
        }
        //��ʼ������ֵ�ڵ��tmp
        ListNode head = new ListNode(0);
        ListNode p = head;
        int tmp = 0;
        //ֻҪ��һ���ǿ�ѭ���ͼ��� ��l1,l2�е�ֵ�ȼӵ�tmp��
        while (l1 !=null||l2 !=null||tmp!=0){
            if(l1 !=null){
                tmp += l1.val;
                l1 = l1.next;
            }
            if(l2 !=null){
                tmp += l2.val;
                l2 = l2.next;
            }
            //ÿ��һ�� �����һ��p�ڵ��ֵ
            p.next = new ListNode(tmp%10);
            p = p.next;
            //��λ
            tmp = tmp /10;
        }
        return head.next;
    }
    //�ⷨ�� �ݹ�
    ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if(l1 == null&&l2 == null){
            return null;
        }else if(l1 == null||l2 == null){
            return l1!=null?l1:l2;
        }else {
            ListNode l3;
            if(l1.val + l2.val<10){
                l3 = new ListNode(l1.val+l2.val);
                l3.next = addTwoNumbers(l1.next, l2.next);
            }else {
                l3 = new ListNode(l1.val+l2.val -10);
                l3.next = addTwoNumbers(l1.next,addTwoNumbers(l2.next,new ListNode(1)));
            }
            return l3;
        }
    }
}