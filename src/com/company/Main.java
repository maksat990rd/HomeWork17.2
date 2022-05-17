package com.company;

public class Main {

    public static void main(String[] args) {

        /** publicabstract double getPerimeter()
         *
         абстракт методун  Shape деген класска кошунуз.
         Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.

         Добавьте абстрактный метод

         public abstract double getPerimeter()

         в класс Shape. Реализуйте этот метод в 5 классах наследниках класса Shape. */

        Shape shape = new Peyviy();
        Shape shape1 = new Vtoroy();
        Shape shape2 = new Tretiy();
        Shape shape3 = new Chetvertiy();
        Shape shape4 = new Piatiy();
        System.out.println(shape.getPerimeter());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape4.getPerimeter());
    }
}

