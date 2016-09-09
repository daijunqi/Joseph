package com.joseph;

import java.util.Scanner;

/**
 * Created by dai on 16-9-9.
 */
public class Run {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        /** 总人数 **/
        int total = scanner.nextInt();

        /** 移除的位数 **/
        int count = scanner.nextInt();

        Base base = new Base(total);
        int last = base.start(count);
        System.out.println(last);
    }
}
