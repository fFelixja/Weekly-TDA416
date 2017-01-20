package com.company;

/*
  a) Skriv en metod som givet två strängar flätar samman dem så att metoden först tar en bokstav från den ena strängen
        sedan en från den andra ända tills någon sträng tar slut.
        Resten i den längre strängen läggs sist i resultatet. Att fläta samman strängen ”anna” med ”patrik” skall till exempel ge resultatet ”apnantarik”.

  b) Lös förra uppgiften med en rekursiv metod.
  */

public class Three {

    public void mergString(String str1, String str2){
        char[] cArray1 = str1.toCharArray();
        char[] cArray2 = str2.toCharArray();
        char[] cString = new char[str1.length() + str2.length()];
        int index = 0;

        for (int i = 0; i < str1.length() || i < str2.length(); i++){
            if (i < str1.length() && i < str2.length()){
                cString[index++] = cArray1[i];
                cString[index++] = cArray2[i];
            } else if (i < str1.length()){
                cString[index++] = cArray1[i];
            } else if ( i < str2.length()){
                cString[index++] = cArray2[i];
            }
        }
        String string = new String (cString);
        System.out.println(string);
    }

}
