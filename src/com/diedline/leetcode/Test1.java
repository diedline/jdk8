package com.diedline.leetcode;

import java.util.ArrayList;

public class Test1 {
    //leetcode ��һ��
    /**
     * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
     *
     * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
     *
     * ʾ��:
     *
     * ���� nums = [2, 7, 11, 15], target = 9
     *
     * ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
     * ���Է��� [0, 1]
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int flag =0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i <nums.length ; i++) {
                for (int j = i+1; j<nums.length ; j++){
                    if (nums[i] +nums[j] == target && flag==0){
                        arrayList.add(i);
                        arrayList.add(j);
                        flag = 1;
                    }
                }
            }
            int[] num2 = new int[arrayList.size()];
            for (int i = 0; i <arrayList.size() ; i++) {
                num2[i] = arrayList.get(i);
            }
            return num2;
        }
    }
}
