package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test22 {
}


class Solution22 {

    @Test
    public void test22(){
        List<String> list = generateParenthesis(3);
        for (String a:list
             ) {
            System.out.println(a);
        }

//        char[] arr = new char[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//
//
//        System.out.println(new String(arr));
    }

    /**
     * ���� n �����������ŵĶ���������д��һ��������ʹ���ܹ��������п��ܵĲ�����Ч��������ϡ�
     *
     * ���磬���� n = 3�����ɽ��Ϊ��
     *
     * [
     *   "((()))",
     *   "(()())",
     *   "(())()",
     *   "()(())",
     *   "()()()"
     * ]
     *
     *
     * ˼·��
     *      ������Ź���������Ҫƥ�䣬����˵���ձ������ʱ��ߵ����ű�����ڵ����ұߵ�����
     *
     *      ֱ�Ӳ�ȡ������ �г����е���� Ȼ���ٽ���У��  ���ɹ���ֵ��ӵ��б���
     * */
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateAll(new char[2 * n], 0, list);
        return list;
    }

    /**
     * ʹ�õݹ����������н��
     * ((((((
     * */
    public void generateAll(char[] current, int pos,List<String> result){
        if(pos == current.length){
            if(valid(current))
                result.add(new String(current));
        }else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }

    }

    /**
     *  ͨ�����ŵ�����ƥ�����ж��Ƿ�Ϸ�
     * */
    private boolean valid(char[] current) {

        int balance = 0;
        for(char c :current){
            if(c == '(') balance++;
            else balance --;
            if(balance <0) return false;
        }
        return (balance == 0);
    }
}