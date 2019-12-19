package com.atguigu.jvm;

import java.util.concurrent.TimeUnit;

/**
 * @author Tituo
 * @create 2019-12-19 11:08
 * 栈内存溢出异常
 */
public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        //System.out.println("*****1111");
        test1();
    }
    public static void test1(){
        //System.out.println("*****2222");
        test1();

    }
}
