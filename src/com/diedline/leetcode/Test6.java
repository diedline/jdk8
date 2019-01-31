package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test6 {
}
/**
 * ��һ�������ַ������ݸ������������Դ������¡������ҽ��� Z �������С�
 *
 * ���������ַ���Ϊ "LEETCODEISHIRING" ����Ϊ 3 ʱ���������£�
 *
 * L   C   I   R    4    1  5  9 .....          ����  4n -3
 * E T O E S I I G  8    2 4 6 8 ......               2n
 * E   D   H   N    4    3,7 ,11                      4n -1
 * ֮����������Ҫ�����������ж�ȡ��������һ���µ��ַ��������磺"LCIRETOESIIGEDHN"��
 *
 * ����ʵ��������ַ�������ָ�������任�ĺ�����
 *
 * string convert(string s, int numRows);
 * ʾ�� 1:
 *
 * ����: s = "LEETCODEISHIRING", numRows = 3
 * ���: "LCIRETOESIIGEDHN"
 * ʾ�� 2:
 *
 * ����: s = "LEETCODEISHIRING", numRows = 4
 * ���: "LDREOEIIECIHNTSG"
 * ����:
 *
 * L     D     R            3
 * E   O E   I I            5
 * E C   I H   N            5
 * T     S     G            3
 *
 * 3+1+3+1+3 ....
 * 4+2+4+2 ......
 * n+n-2+n+n-2 .....
 */
class Solution6{

    @Test
    public void test() {
        System.out.println(convert("LEETCODEISHIRING",4));
    }
    /** ˼· ��
     * ����һ���� ��ǰ�ַ�����ͬ��С��char����� һ�� int[]����
     * int[]�����ȡ�������к�� �ַ�˳��
     * char����������� int[]�������ı��
     * ��� ֱ�ӷ���string�Ĺ����Ok
     *
     */


    public String convert(String s, int numRows) {
        int n = 0;
        int length = s.length();
        int[] indx = new int[numRows];
        char[] chars = new char[length];
        if(numRows ==1){
            return  s;
        }
        // 4*2 -2 6     16 % 6   2 3     3
        int size = numRows * 2 -2;
        int num =length / size;
        int rem =length % size;
        for (int i = 1; i < numRows; i++) {
            int flag = i == 1 ? 1:2;
            // ��ⲻ�ˡ�����
            n = flag * num + (rem >= i ? (1 + (size - rem + 1 <i ? 1:0)):0);
            indx[i] = indx[i-1] + n;
        }
        int flag = -1;
        int curRow = 0;
        for(char c : s.toCharArray()){
            chars[indx[curRow]] = c;
            indx[curRow] = indx[curRow] + 1;
            if (curRow == 0 || curRow == numRows - 1) flag = -flag;
            curRow += flag;
        }
        return new String(chars);
    }
}
