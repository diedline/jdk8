package com.diedline.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * java8 �����õ��Ĵ���ĺ���ʽ�ӿ�
 * Consumer<T> �����ͽӿ�
 *      void accept(T t);
 *
 * Supplier<T> �����ͽӿ�
 *      T get();
 *
 * Function<T,R> �����ͽӿ�
 *      R apply(T t1,T t2)  ���Դ��������
 *
 * Predicate<T> �����ͽӿ�
 *      boolean test(T t);
 */
public class TestLambda3 {
    //Consumer<T> �����ͽӿ�
    @Test
    public void test1(){
        happy(10000,(m) -> System.out.println("��ȥ��������"+m+"Ԫ"));
    }
    public void happy(double money, Consumer<Double> con  ){
        con.accept(money);
    }

    //Supplier<T> �����ͽӿ�
    @Test
    public void test2(){
        //ʹ��math��random ���� ÿ�β���ʮ�������
        List<Integer> list = getNum(10,()-> (int) (Math.random() * 100));
        for (Integer a:list
             ) {
            System.out.println(a);
        }
    }
    //���󣺲���ָ�������������������뼯����
    public List<Integer> getNum(int num, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();     //��������
        for (int i = 0; i < num;i++){
            Integer a = supplier.get();
            list.add(a);
        }
        return list;
    }

    //Function<T,R> �����ͽӿ�
    @Test
    public void test3(){
        //Сдת��д
        String a = strOpr("abcde", String::toUpperCase);
        System.out.println(a);
        //ȥ���ո�
        String b = strOpr("\t\t�ҵķ��� ",String::trim);
        System.out.println(b);
    }

    //�������ڴ����ַ���
    public String strOpr(String a, Function<String,String> function){
        return function.apply(a);
    }



    //Predicate<T> �����ͽӿ�

    //����:�������������ַ������뵽������
    @Test
    public void test4(){
        List<String> list= Arrays.asList("hello","123","Lambda","www","OK");
        //���˻�ȡ�ַ����ȴ���3���ַ���
        List<String> strList = getList(list,(a) -> a.length()>3);
        for (String a:strList
             ) {
            System.out.println(a);
        }
    }
    public  List<String> getList(List<String> list, Predicate<String> predicate){
        List<String> strlist = new ArrayList<>();
        for (String a:list
             ) {
            if(predicate.test(a)){
                strlist.add(a);
            }
        }
        return strlist;
    }

}
