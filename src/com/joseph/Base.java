package com.joseph;

/**
 * Created by dai on 16-9-9.
 */
public class Base {

    public int[] group;

    public int size;

    /**
     * 初始化圈子
     *
     * @param i 总人数
     */
    public Base(int i) {
        group = new int[i];
        for (int j = 0; j < i; j++) {
            group[j] = j + 1;
        }
        size = i;
    }

    /**
     * 开始报数
     *
     * @param count 移除的数字
     */
    public int start(int count) {
        int now = -1;
        for (; size != 1; ) {
            now += count;
            if (now + 1 > size) {
                now = (now + 1) % size - 1;
                now = now < 0 ? size : now;
            }
            remove(now);
            now--;
        }
        return group[0];
    }

    /**
     * 移除
     *
     * @param i 移除的位置
     */
    public void remove(int i) {
        for (int j = i; j < size - 1; j++) {
            group[j] = group[j + 1];
        }
        size--;
    }
}
