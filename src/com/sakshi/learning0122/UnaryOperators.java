package com.sakshi.learning0122;

public class UnaryOperators {

    public static void main(String[] args) {
        int coutn = 100;

        coutn++;

        while (coutn < 500) {
            coutn += 100;
           //      System.out.println(coutn);
            coutn--;
             //     System.out.println(coutn);

        }
        //   System.out.println(coutn);
        int counter = 19;

        System.out.println("Pre-increment (++counter)::"+ ++counter);//20
        System.out.println("Pre-decrement (--counter)::"+ --counter);//19
        System.out.println("Post-increment (counter++)::"+ counter++);//19
        System.out.println("Post-decrement (counter--)::"+ counter--);//20
    //19
        //
        }
}
