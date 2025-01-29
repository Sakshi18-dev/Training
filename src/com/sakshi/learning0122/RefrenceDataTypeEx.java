package com.sakshi.learning0122;

public class RefrenceDataTypeEx {
    // Class, Object, Arrays, String
    public static void main(String[] args) {
        int count =10;
        Person obj = new Person(12,"sakshi");
        System.out.println("name::" +obj.getName());
        System.out.println("age::" +obj.getAge());

        //Arrays
        int[] num1 = new int[] {12, 14, 89, 45, 56, 34, 84, 90,34};
        int[] num2 = {123, 453, 546, 786, 342, 970, 237};
        System.out.println("Length of num1:" +num1.length);
        System.out.println("Length of num2:" +num2.length);
        System.out.println("Third Element of num2:" +num2[2]);

   // String
        String Breakfast = "Bread Pakora";
        System.out.println("Breakfast for Sunday:" +Breakfast);



    }
    //Class
 static class Person {

        public String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int age;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

    }
}
