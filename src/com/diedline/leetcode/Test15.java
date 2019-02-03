package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

public class Test15 {
}

/**
 * ����һ������ n ������������ nums���ж� nums ���Ƿ��������Ԫ�� a��b��c ��
 * ʹ�� a + b + c = 0 ���ҳ��������������Ҳ��ظ�����Ԫ�顣
 *
 * ע�⣺���в����԰����ظ�����Ԫ�顣
 *
 * ����, �������� nums = [-1, 0, 1, 2, -1, -4]��
 *
 * ����Ҫ�����Ԫ�鼯��Ϊ��
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2] 
 * ]
 */
class Solution15 {

    @Test
    public void test(){
        int[] num = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum1(num));
    }

    //ֱ�ӱ����㷨��ʱ ����ʹ�ö��ַ�����
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length ; j++ ) {
                for (int k = 0; k < nums.length; k++) {
                    if(j != i && j!=k && i!=k && nums[i] + nums[j] == - nums[k]){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                        list.sort(Integer::compareTo);
                        lists.add(list);
                    }
                }
            }
        }

        Set<List<Integer>> set = new HashSet<>();
        set.addAll(lists);
        List<List<Integer>> lists1 = new ArrayList<>();
        lists1.addAll(set);

        return lists1;
    }

    //ʹ�ö��ַ�
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int jNum;
        int iNum;
        int kNum;
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            Arrays.sort(nums);
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }else {
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    list.sort(Integer::compareTo);
                    lists.add(list);

                    jNum = nums[j];
                    do {
                        j++;
                        if(j >= k){
                            break;
                        }
                    }while (nums[j] ==jNum);
                    kNum = nums[k];
                    do {
                        k--;
                        if (j >= k){
                            break;
                        }
                    }while (kNum == nums[k]);
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>();
        set.addAll(lists);
        List<List<Integer>> lists1 = new ArrayList<>();
        lists1.addAll(set);
        return lists1;
    }
}