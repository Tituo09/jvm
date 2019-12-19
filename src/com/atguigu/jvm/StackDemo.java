package com.atguigu.jvm;

import java.util.concurrent.TimeUnit;

/**
 * @author Tituo
 * @create 2019-12-19 10:59
 * 栈运行原理
 *      弹夹：先进后出，后进先出
 *  队列：
 *      先进先出，后进后出
 */
public class StackDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*********1111");
        test01();
        System.out.println("*********4444");

    }
    public static void test01() throws InterruptedException {
        System.out.println("********2222");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("********3333");

    }
}
