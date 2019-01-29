package com.diedline.java8;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;

/**
 * Lambda �Ļ����﷨ �µĲ����� "->"  ��Ϊ lambda ������
 *                      �ò�������lambda ��Ϊ������
 * ��ࣺLambda ���ʽ�еĲ����б�
 * �ҲࣺLambda������Ҫ�Ĺ���
 *
 * �﷨��ʽһ�� �޲��޷���ֵ
 *  () ->System.out,println("123");
 * �﷨��ʽ���� ��һ���������޷���ֵ�ķ���
 *  (x) -> System.out.println(x);
 * �﷨��ʽ����ֻ��һ��������С���ſ���ʡ�Բ�д
 *  x -> System.out.println(x);
 * �﷨��ʽ�ģ����������ϵĲ���������lambda�����ж������,��Ҫʹ�ô����ź�return
 *    Comparator<Integer> con = (x,y) -> {
 *             System.out.println("����ʽ�ӿ�");
 *             return Integer.compare(x,y);
 *         };
 * �﷨��ʽ�壺��lambda����ֻ��һ�����,return �ʹ����Ŷ�����ʡ�Բ�д
 *      Comparator<Integer> con = (x,y) ->  Integer.compare(x,y);
 * �﷨��ʽ����Lambda���ʽ�Ĳ����б���������Ϳ���ʡ�Բ�д����Ϊjvm�ı����ڿ���ͨ���������ƶϳ���������
 *      (Integer x,Integer y) ->  Integer.compare(x,y);
 *
 * ������һ����ʡ
 * ����ƶ�����ʡ
 *
 * ����lambda���ʽ��Ҫ������ʽ�ӿڵ�֧�֡�
 * ����ʽ�ӿڣ��ӿ���ֻ��һ�����󷽷�ʱ�����Ǻ���ʽ�ӿڿ���ʹ�� @FunctionalInterface ����
 *              ���Լ���Ƿ��Ǻ���ʽ�ӿ�
 * */
public class TestLambda2 {
    @Test
    public void test1(){
        //ʹ�������ڲ���
        int num = 0;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello,world!" + num);
            }
        };
        r.run();
        System.out.println("----------------");
        //ʹ��lambda ���ʽ
        Runnable r1 = ()-> System.out.println("Hello,world!");
        r1.run();
    }

    @Test
    public void test2(){
        Consumer<String> con = x -> System.out.println(x);
        con.accept("������");
    }

    @Test
    public void test3(){
        Comparator<Integer> con = (x,y) -> {
            System.out.println("����ʽ�ӿ�");
            return Integer.compare(x,y);
        };
    }
    @Test
    public void test4(){
        Comparator<Integer> con = (x,y) ->  Integer.compare(x,y);
    }

    @Test
    public void test5(){
        Comparator<Integer> con = (Integer x,Integer y) ->  Integer.compare(x,y);
        System.out.println(2);
    }

    //�����ƶ�
    public void test6(){
//        String[] strs;
//        strs  = {"aaa","bbb","ccc"};
        List<String> list = new ArrayList<>();
        show(new HashMap<>());
    }

    public void show(Map<String,Integer> map){
    }

    //���󣺶�һ������������
    @Test
    public void test7(){
        Integer num = operation(100,(x) -> x * x);
        System.out.println(num);
        System.out.println(operation(200,(y) -> y + 200));
    }

    public Integer operation(Integer num, MyFun mf){
        return mf.getValue(num);
    }
}
