package com.atguigu.jvm;

import java.net.URL;

/**
 * @author Tituo
 * @create 2019-12-18 20:17
 */
public class HelloJvm {
    public static void main(String[] args) {
        /*
        程序运行时加载的类
         */
            URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
            for (URL element:urls) {
                System.out.println(element.toExternalForm());
            }

        /*
        类加载器
         */
       /* Object o = new Object();
        System.out.println(o.getClass().getClassLoader());

        HelloJvm helloJvm = new HelloJvm();
        System.out.println(helloJvm.getClass().getClassLoader());
        System.out.println(helloJvm.getClass().getClassLoader().getParent());
        System.out.println(helloJvm.getClass().getClassLoader().getParent().getParent());*/
    }
}
