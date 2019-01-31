package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test5 {
}
/**
 * ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��
 *
 * ʾ�� 1��
 *
 * ����: "babad"
 * ���: "bab"
 * ע��: "aba" Ҳ��һ����Ч�𰸡�
 * ʾ�� 2��
 *
 * ����: "cbbd"
 * ���: "bb"
 */
class Solution5 {
    @Test
    public void test(){
//        Index index = new Index(0,1);
//        HashMap<Integer,Index> indexMap = new HashMap<>();
//        indexMap.put(0,index);
//        System.out.println(indexMap.get(0).getA() + indexMap.get(0).getB());
        longestPalindrome("abbae");
    }

    /**
     * ˼·��
     *  ���ж��Ƿ����������ͬ���ַ��������������ͬ���ַ��ͽ����ַ���������л��ļ���жϳɹ���
     *  ����ַ���������ֵ֮������õ���������������Ӵ��ĳ��� ���Կ��Դ���һ�� HashMap��������ȴ�ȡȻ��������
     * @param
     * @return
     */
    class Index{
        int a;      //��ʼ����
        int b;      //��������

        public Index() {
        }

        public Index(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
    public String longestPalindrome(String s) {
        HashMap<Index,Character> hashMap = contain(s);
        Set<Integer> set = null;

        HashMap<Integer,Integer> hs = isPalindrome(s,hashMap);
        //�ȱ���������
        set = hs.keySet();
        for (Integer i:set
             ) {
            System.out.println(i+" "+hs.get(i));
        }
        return "a";
    }
    //��дһ���ж��Ƿ���ĵķ���
    public HashMap<Integer,Integer> isPalindrome(String s,HashMap<Index,Character> hs){
        HashMap<Integer,Integer> hs1 = new HashMap<>();
        char[] arr = s.toCharArray();
        //�Ȼ�ȡhashMap������ֵ
        Set<Index> set = hs.keySet();
        //����keyֵ��ȡ������ ������arrayList��
        ArrayList<Index> arrayList = new ArrayList<>();
        //����arrayList��ÿһ��ֵ���ж�һ���Ƿ��ǻ���
        for (Index x:set
             ) {
            int start = x.getA();
            int end = x.getB();
            for(int i = (start + end)/2 ; i >= start; i--){
                for (int j = (start + end)/2; j <= end; j++) {
                    if (arr[i] != arr[j]){
                        return null;
                    }else {
                        hs1.put(start,end);
                    }
                }
            }
        }

        return hs1;
    }

    //ֱ�Ӿ͵õ���һ��HashMap��������Ҫ��������Ϣ �����Ƚ��˷�ʱ�临�Ӷ�
    public HashMap<Index,Character> contain(String s){
        char[] arr = s.toCharArray();
        HashMap<Index,Character> hashMap = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j<arr.length; j++){
                //i0 �� i3
                if(arr[i] == arr[j]){
                    //����������������ʼ��index��Ϊ��ͬ�ĵ�ַ�ռ�Ὣ��ֵͬ��index��Ϊ��ͬһ��
                    Index index = new Index();
                    index.setA(i);
                    index.setB(j);
                    hashMap.put(index,arr[i]);
                }
            }
        }
       return hashMap;
    }
}