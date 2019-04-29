package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test35 {
}

/**
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 *
 * ����Լ������������ظ�Ԫ�ء�
 *
 * ʾ�� 1:
 *
 * ����: [1,3,5,6], 5
 * ���: 2
 * ʾ�� 2:
 *
 * ����: [1,3,5,6], 2
 * ���: 1
 * ʾ�� 3:
 *
 * ����: [1,3,5,6], 7
 * ���: 4
 * ʾ�� 4:
 *
 * ����: [1,3,5,6], 0
 * ���: 0
 * */
class Solution35 {

    @Test
    public void test(){
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,2));
    }

    /**
     * ˼· ʹ��ʹ��O��n��
     * */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target < nums[0]){
                return 0;
            }
            if(target > nums[nums.length -1]){
                return nums.length;
            }
            if(target == nums[i]){
                return i;
            }
            if( nums[i]<target && nums[i+1] > target ){
                return i+1;
            }
        }
        return -1;
    }
}