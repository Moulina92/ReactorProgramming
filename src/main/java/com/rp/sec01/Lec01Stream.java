package com.rp.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lec01Stream {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("3");
        list.add("6");
        list.add("15");

        list.stream().mapToInt(i-> Integer.parseInt(i)).filter(j-> j%3==0).forEach(System.out::println);


        Stream<Integer> stream = Stream.of(1)
                .map(i ->{
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return  i*2 ;
                });

        stream.forEach(System.out::println);
    }


}
