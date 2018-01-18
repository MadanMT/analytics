package com.avanseus.algorithms;

import org.omg.PortableInterceptor.INACTIVE;

import javax.print.DocFlavor;
import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Generics<T>   {

    public <T>void test(ArrayList<?> arrayList){
        arrayList.add(null);
        arrayList.forEach(a-> System.out.println(a));
        System.out.println(arrayList);
    }

    public void test1(ArrayList arrayList){
//        arrayList.add(1);
        arrayList.add(10.5);
        arrayList.add(10.2);
        arrayList.add(10.9);
//        arrayList.add(true);
    }


    public static void main(String[] args) {
        /*Generics<String> a = new Generics<>();
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        a.test1(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        double a = 1_2.3,d = 0.6   ;
        byte a1 = -12;
        System.out.println(a+10);
        short n = 32767;




//        arrayList.add("a");
//        arrayList.add(1);
//        System.out.println((String) arrayList. );

    }
}

