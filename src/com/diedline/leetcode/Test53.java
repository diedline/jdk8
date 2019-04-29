package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test53 {
}
/**
 * ����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
 *
 * ʾ��:
 *
 * ����: [-2,1,-3,4,-1,2,1,-5,4],
 * ���: 6
 * ����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
 * ����:
 *
 * ������Ѿ�ʵ�ָ��Ӷ�Ϊ O(n) �Ľⷨ������ʹ�ø�Ϊ����ķ��η���⡣
 * */
class Solution53 {
    @Test
    public void test(){
        int[] nums = {4, -1, 2, 1};
        System.out.println(maxSubArray(nums));
    }

    /**
     * ˼·��ȡ�����Ӵ������ֵ�͵���ֵ���бȽ�
     *
     * */
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num:nums){
            if(sum > 0){
                sum += num;
            }else sum = num;
            res = Math.max(res,sum);
        }
        return res;
    }
}
