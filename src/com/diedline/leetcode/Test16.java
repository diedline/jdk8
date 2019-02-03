package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test16 {
}
/**
 * ����һ������ n ������������ nums �� һ��Ŀ��ֵ target���ҳ� nums ��
 * ������������ʹ�����ǵĺ��� target ��ӽ����������������ĺ͡��ٶ�ÿ������ֻ����Ψһ�𰸡�
 *
 * ���磬�������� nums = [-1��2��1��-4], �� target = 1.
 *
 * �� target ��ӽ����������ĺ�Ϊ 2. (-1 + 2 + 1 = 2).
 */
class Solution16 {
    @Test
    public void test(){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }

    //ʹ�ö��ַ� �ȶ������������  Ȼ���ٻ�ȡ���ֵ
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp = 0;
        int sum1 = nums[0] + nums[1]+ nums[2];
        if(nums.length == 3){
            return sum1;
        }
        for (int i = 0; i < nums.length-1; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            //���巵����ӽ���ֵ



            while (j < k){
                int sum = nums[i] + nums[j] +nums[k];
                if(sum < target){
                    j++;
                    //�ҳ���ӽ���ֵ
                    if(Math.abs(sum- target) <= Math.abs(sum1 - target)){
                        temp = sum;
                        sum1 = sum;
                    }

                }else if (sum > target){
                    k--;
                    if(Math.abs(sum- target) <= Math.abs(sum1 - target)){
                        temp = sum;
                        sum1 = sum;
                    }
                }else {
                    //����ֻ�з����Ǹ�ֵ
                    return sum;
                }
            }
        }
      return temp;
    }
}