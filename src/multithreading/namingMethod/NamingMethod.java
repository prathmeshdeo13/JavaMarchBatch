package multithreading.namingMethod;

import multithreading.Test;

public class NamingMethod {

    public static void main(String[] args) {
        Thread.currentThread().setName("Shekhar");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Kanchan");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
