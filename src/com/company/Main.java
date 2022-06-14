package com.company;

public class Main {

    public static void main(String[] args) {
        class Cat {
            int age;
            String name;

            void meow() {
                if (age < 2) {
                    System.out.println("miau miau");
                } else if (age > 2 && age < 5) {
                    System.out.println("miaaaaauuu");
                } else {
                    System.out.println("MIAU");
                }
            }
        }


        class CatTester {

            public  void main(String[] args) {
                Cat Kicia = new Cat();
                Kicia.age = 1;
                Cat Lena = new Cat();
                Lena.age = 3;
                Cat Rudy = new Cat();
                Rudy.age = 11;
                Kicia.meow();
                Lena.meow();
                Rudy.meow();
            }
        }
    }
}

