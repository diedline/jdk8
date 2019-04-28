package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test42 {
    /**
     * ���� n ���Ǹ�������ʾÿ�����Ϊ 1 �����ӵĸ߶�ͼ�����㰴�����е����ӣ�����֮���ܽӶ�����ˮ��
     * <p>
     * <p>
     * <p>
     * ������������ [0,1,0,2,1,0,1,3,2,1,2,1] ��ʾ�ĸ߶�ͼ������������£����Խ� 6 ����λ����ˮ����ɫ���ֱ�ʾ��ˮ���� ��л Marcos ���״�ͼ��
     * <p>
     * ʾ��:
     * <p>
     * ����: [0,1,0,2,1,0,1,3,2,1,2,1]
     * ���: 6
     */
    @Test
    public void test() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }


    /***
     *  ˼·��
     *        ��������ѽ
     *          ��������
     *
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        // �������鷽�ɻ�ˮ
        if (height.length < 3) return 0;

        int i, result = 0, length = height.length;

        int[] L = new int[length], R = new int[length];

        // ��¼ÿ���������/�ұߵ���ߵ���߶�
        for (i = 1; i < length; i++) {
            L[i] = Math.max(L[i - 1], height[i - 1]);
            R[length - 1 - i] = Math.max(R[length - i], height[length - i]);
        }

        // �����ˮ
        for (i = 0; i < length; i++) {
            if (L[i] > height[i] && R[i] > height[i]) {
                result += Math.min(L[i], R[i]) - height[i];
            }
        }
        return result;
    }
//        public int trap(int[] height) {
//            for (int i = 0; i < height.length; i++) {
//                if(height[i]<height[i+1]){
//
//                }
//            }
//
//        }


}
