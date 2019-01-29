package com.diedline.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * һ.Stream ��������������
 * 1. ����Stream
 * 2. �м����
 * 3. ��ֹ�������ն˲�����
 */
public class TestStreamAPI1 {
    //����Stream �ķ���
    @Test
    public void test1(){
        //1.����ͨ��Collection ϵ�м����ṩ��stream() ��������parallelStream ������
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //2.ͨ��Arrays�еľ�̬����stream() ��ȡ������
        Employee[] employees =  new Employee[10];
        Stream<Employee> stream1 = Arrays.stream(employees);

        //3.ͨ��Stream ���еľ�̬����of()����ȡ��
        Stream<String> stream2 = Stream.of("aa","bb","cc");

        //4.����������
        //��������������
        Stream<Integer> stream3 = Stream.iterate(0,(x) ->x+2);
        stream3.limit(10).forEach(System.out::println);

        //ʹ��generate������������
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
