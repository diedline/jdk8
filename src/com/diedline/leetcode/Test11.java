package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

public class Test11 {
}
/**
 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ������
 * ���ڻ� n ����ֱ�ߣ���ֱ�� i �������˵�ֱ�Ϊ (i, ai) �� (i, 0)���ҳ����е������ߣ�ʹ��
 * ������ x �Ṳͬ���ɵ�����������������ˮ��
 *
 * ˵�����㲻����б�������� n ��ֵ����Ϊ 2��
 */

class Solution11 {


    @Test
    public void test() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    /**
     * ʾ��:
     * <p>
     * ����: [1,8,6,2,5,4,8,3,7]
     * ���: 49
     * ˼·����ȡ��������* ����ֵ���������
     *       ��������Ҫ�ҹ����Ż�����
     *
     * @param height
     * @return
     */
    //̫��ʵ�� o^2�ľ�������
    public int maxArea(int[] height) {
        //ֱ�ӽ����ֵ��Ϊtemp����
        int temp = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int c = compare(height[i], height[j], Integer::min) * Math.abs(j - i);
                if(c>temp){
                    temp = c;
                }
            }

        }
        return temp;
    }



    public Integer compare(Integer a, Integer b, BiFunction<Integer,Integer,Integer> bi){
        return bi.apply(a,b);
    }


    //�ڶ��ַ�ʽ����̬�滮  ʱ�临�Ӷ�o��n��   �ռ临�Ӷ� o(1)
    public int maxArea1(int[] height) {
        int maxarea = 0, l = 0;
        int r = height.length -1;
        while (l < r){
            maxarea = Math.max(maxarea,Math.min(height[l],height[r]) * ( r - l ));
            //���� ���û�ұߵ�ֵ�� �������ƶ�ָ�� ���������
            if(height[l] <height[r]){
                l++;
            }else r--;
        }
        return maxarea;
    }
}