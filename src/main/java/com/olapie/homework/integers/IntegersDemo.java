package com.olapie.homework.integers;

import java.math.BigInteger;

public class IntegersDemo {
    public static void cache() {
        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println( a == b); // true
        System.out.println( c == d ); // false
        // Java caches integers from -128 to 127, but larger values are new objects
    }

    public static void overflow() {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        var a = 1_000_1000;
        System.out.println(a*a); //-1197389248

        var b = new BigInteger("1_000_1000");
        System.out.println(b.multiply(b));
    }
}
