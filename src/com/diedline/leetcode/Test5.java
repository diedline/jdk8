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
        HashMap hashMap = contain(s);
        return "a";
    }
    //��дһ���ж��Ƿ���ĵķ���
    public boolean isPalindrome(String s,HashMap<Character,Index> hs){
        char[] arr = s.toCharArray();
        //�Ȼ�ȡhashMap������ֵ
        Set<Character> set = hs.keySet();
        ArrayList<Index> arrayList = new ArrayList<>();
        //����keyֵ��ȡ������ ������arrayList��
        for (Character c:set
             ) {
            arrayList.add(hs.get(c));
        }
        //����arrayList��ÿһ��ֵ���ж�һ���Ƿ��ǻ���
        for (Index x:arrayList
             ) {
            int start = x.getA();
            int end = x.getB();
            //�����ȵ�����˯����88
            return true;
        }
        return true;
    }

    //ֱ�Ӿ͵õ���һ��HashMap��������Ҫ��������Ϣ �����Ƚ��˷�ʱ�临�Ӷ�
    public HashMap<Character,Index> contain(String s){
        char[] arr = s.toCharArray();
        HashMap<Character,Index> hashMap = new HashMap<>();
        Index index = new Index();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    index.setA(i);
                    index.setB(j);
                    hashMap.put(arr[i],index);
                }
            }
        }
       return hashMap;
    }
}