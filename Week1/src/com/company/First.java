package com.company;

/*Skriv en metod som givet ett argument av typen int[], ett heltal samt ett index placerar in heltalet på den
position som ges av indexet samt flyttar alla element i fältet med samma eller högre index ett steg ”uppåt".
Det sista elementet i fältet försvinner ur fältet om antalet tal i fältet skulle bli för stort.
För att kunna testa metoden kan det vara bra att använda Arrays.toString(int[] a) i util-paketet.
 */

import java.util.Arrays;

public class First {

    public void f(int[] arr, int a, int index){

        for (int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i -1];
        }
        arr[index] = a;

        System.out.println(Arrays.toString(arr));
    }
}
