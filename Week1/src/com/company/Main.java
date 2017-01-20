package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static void One(){
        int[] arr = {0,1,2,3,4,5,6,7} ;
        int index, a;
        a = 666;
        index = 2;
        One one = new One();
        one.f(arr,a,index);
    }

    private static void Two(){
        Two two = new Two();
        Path path = Paths.get("/Users/felixjansson/develop/Weekly-TDA416/Week1/src/com/company/txt");
        two.freakCount(path);
    }

    private static void three(){
        String str1 = "anna";
        String str2 = "patrik";
        Three three = new Three();
        three.mergString(str1,str2);
    }

    public static void main(String[] args) {
        three();
    }
}
