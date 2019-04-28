package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Test71 {
    /***
     * �� Unix ������һ���ļ��ľ���·��������Ҫ���������߻��仰˵������ת��Ϊ�淶·����
     *
     * �� Unix �����ļ�ϵͳ�У�һ���㣨.����ʾ��ǰĿ¼�������⣬������ ��..�� ��ʾ��Ŀ¼�л�����һ����ָ��Ŀ¼�������߶������Ǹ������·������ɲ��֡�������Ϣ����ģ�Linux / Unix�еľ���·�� vs ���·��
     *
     * ��ע�⣬���صĹ淶·������ʼ����б�� / ��ͷ����������Ŀ¼��֮�����ֻ��һ��б�� /�����һ��Ŀ¼����������ڣ������� / ��β�����⣬�淶·�������Ǳ�ʾ����·��������ַ�����
     *
     *
     *
     * ʾ�� 1��
     *
     * ���룺"/home/"
     * �����"/home"
     * ���ͣ�ע�⣬���һ��Ŀ¼������û��б�ܡ�
     * ʾ�� 2��
     *
     * ���룺"/../"
     * �����"/"
     * ���ͣ��Ӹ�Ŀ¼����һ���ǲ����еģ���Ϊ��������Ե������߼���
     * ʾ�� 3��
     *
     * ���룺"/home//foo/"
     * �����"/home/foo"
     * ���ͣ��ڹ淶·���У��������б����Ҫ��һ��б���滻��
     * ʾ�� 4��
     *
     * ���룺"/a/./b/../../c/"
     * �����"/c"
     * ʾ�� 5��
     *
     * ���룺"/a/../../b/../c//.//"
     * �����"/c"
     * ʾ�� 6��
     *
     * ���룺"/a//b////c/d//././/.."
     * �����"/a/b/c"
     */
    @Test
    public void test71(){
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
    }

    /**
     * ˼·
     *      ��������ȥ�����/
     *      Ȼ����ʹ��/���ָ��ַ���������ַ�����
     *      Ȼ��ʹ��ջ����ȡ��Ҫ���������и��ּ���ж�
     *      ���ʹ��StringBuilder������ջ���ַ�����ƴ��
     * @param path
     * @return
     */

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String regex = "\\/+";
        //ȥ�����"/"
        path = path.replaceAll(regex,"/");


        String[] words = path.split("/");

        for (String word:words
             ) {
            if("".equals(word) ||".".equals(word)||("..".equals(word) &&stack.isEmpty())){
                continue;
            }else if("..".equals(word) &&!stack.isEmpty()){
                stack.pop();
            }else {
                stack.push(word);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        if(stack.isEmpty()){
            return "/";
        }else {
            Object[] arr = stack.toArray();
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append("/"+arr[i].toString());
            }
        }

        return stringBuilder.toString();

    }
}
