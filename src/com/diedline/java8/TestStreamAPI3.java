package com.diedline.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * ��ֹ����
 *
 */
public class TestStreamAPI3 {
    List<Employee> employees = Arrays.asList(
            new Employee("����",18,9999.99, Employee.Status.FREE),
            new Employee("����",38,2323.99,Employee.Status.BUSY),
            new Employee("����",78,4349.99,Employee.Status.VOCATION),
            new Employee("����",8,23539.99,Employee.Status.BUSY),
            new Employee("����",16,91233.99,Employee.Status.BUSY),
            new Employee("����",16,91233.99,Employee.Status.FREE),
            new Employee("����",16,91233.99,Employee.Status.BUSY)
    );
    /**
     *   ������ƥ��
     *
     * allMatch--����Ƿ�ƥ������Ԫ��
     * anyMatch--����Ƿ�ƥ������һ��Ԫ��
     * noneMatch--����Ƿ�û��ƥ������Ԫ��
     * findFirst--���ص�һ��Ԫ��
     * findAny--���ص�ǰ���е�����Ԫ��
     * count--��������Ԫ�صĸ���
     * max--�������е����ֵ
     * min--�������е���Сֵ
     */
    @Test
    public void test1(){
        //allMatch�ж��Ƿ�ƥ������Ԫ��
        boolean b1 = employees.stream().allMatch((e) ->e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);

        //anyMatch�ж��Ƿ�ƥ������һ��Ԫ��
        boolean b2 = employees.stream().anyMatch((e) ->e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);

        //noneMatch �ж��Ƿ����ж�ûƥ�䵽
        boolean b3 = employees.stream().noneMatch((e) ->e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b3);
        //Optional ���������Ԥ����ָ���쳣 ���п���Ϊ�վͽ�ֵ�������������
        //ʹ��findFirst����ȡ�ҵ��ĵ�һ��ֵ���ص�Optional ����
        Optional<Employee> op = employees.stream()
                .sorted((e1,e2) ->-Double.compare(e1.getSalary(),e2.getSalary()))
                .findFirst();
        System.out.println(op.get());

        //ʹ��findAny ����һ������ֵ
        Optional<Employee> op1 = employees.stream().filter((a) -> a.getStatus().equals(Employee.Status.FREE))
                .findAny();
        System.out.println(op1.get());
        //���ʹ��parallelStream ������ ʹ��findAny��ȡ��ֵ����ʵ�����
        Optional<Employee> op2 = employees.parallelStream().filter((a) -> a.getStatus().equals(Employee.Status.FREE))
                .findAny();
        System.out.println(op2.get());
    }

    @Test
    public void test2(){
        Long count = employees.stream().count();
        System.out.println(count);
        //��ȡ���ʵ����ֵ��Ա��
        Optional<Employee> op = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        op.ifPresent(System.out::println);
        //��ȡ���ʵ���Сֵ ��ΪҪֱ�ӻ�ȡ��������Ҫʹ��map����ȡ����Ȼ��ʹ��min��ȡ��Сֵ
        Optional<Double> op1 = employees.stream()
                .map(Employee::getSalary)
                 .min(Double::compare);
        System.out.println(op1.get());
    }
    /**
     *  ��Լ
     *  reduce(T identity,BinaryOperator) / reduce(BinaryOperator)  --���Խ�����Ԫ�ط�����������õ�һ��ֵ
     *
     *  map--reduce������ͨ����Ϊmap--reduceģʽ����Google������������������������
     */
    @Test
    public void test3(){
        List<Integer> list = Arrays.asList(1,2,34,6,5,8,10,100);
        //reduce ��һ��ֵ����ʼֵ
        Integer sum = list.stream().reduce(0,(x,y) ->x+y);
        System.out.println(sum);

        System.out.println("------------------------------");
        //ʹ��reduce����ȡ�����ܺ�
        Optional<Double> salary = employees.stream().map(Employee::getSalary)
                .reduce(Double::sum);
        System.out.println(salary.get());
    }
}
