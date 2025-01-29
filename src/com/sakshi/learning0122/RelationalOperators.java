package com.sakshi.learning0122;

public class RelationalOperators {



    public static void main(String[] args) {

        // >, >=, <, <=, !=
        int a =340;
        int b =97;


        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isSmaller = a < b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLessOrEqual = a <= b;


        System.out.println("IsEqual :: "+ isEqual);
        System.out.println("isNotEqual :: "+ isNotEqual);
        System.out.println("isGreater :: "+ isGreater);
        System.out.println("isSmaller :: "+ isSmaller);
        System.out.println("isGreaterOrEqual :: "+ isGreaterOrEqual);
        System.out.println("isLessOrEqual :: "+ isLessOrEqual);
        if (a==b) {
            System.out.println("a is equal to b");
        } else if (a != b) {
                System.out.println("a is not equal to b");
            }

        if (a<=b) {
            System.out.println("a is less than b");
        }    else if (a > b) {
                System.out.println("a is greater than b");
            }

         if (a>=b) {
             System.out.println("a is greater than b");
         }     else if (a < b) {
                 System.out.println("a is less than b");
             }

         if (a!=b) {
             System.out.println("a is not equal to b");
         }
         }
        }
