package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static void first(){
        int[] arr = {0,1,2,3,4,5,6,7} ;
        int index, a;
        a = 666;
        index = 2;
        First first = new First();
        first.f(arr,a,index);
    }

    private static void second(){
        Second second = new Second();
        Path path = Paths.get("/Users/felixjansson/develop/Weekly-TDA416/Week1/src/com/company/txt");
        second.freakCount(path);
    }

    public static void main(String[] args) {
        second();
    }
}