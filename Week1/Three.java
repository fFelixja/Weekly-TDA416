
/*
  a) Skriv en metod som givet två strängar flätar samman dem så att metoden först tar en bokstav från den ena strängen
        sedan en från den andra ända tills någon sträng tar slut.
        Resten i den längre strängen läggs sist i resultatet.
        Att fläta samman strängen ”anna” med ”patrik” skall till exempel ge resultatet ”apnantarik”.

  b) Lös förra uppgiften med en rekursiv metod.
  */

public class Three {

    private int index;
/*Del A */
    public void mergStringA(String str1, String str2){
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

/*Del B*/
    public void printMergeString(String str1, String str2){
      System.out.println(getMergeString(str1, str2));
    }

    private String getMergeString(String str1, String str2){
      return new String(getCharArray(str1, str2));
    }

    private char[] getCharArray(String str1, String str2){
      char[] cArray = new char[str1.length() + str2.length()];
       char[] cStr1 = str1.toCharArray();
       char[] cStr2 = str2.toCharArray();
       createChar(cStr1,cStr2,0,0,cArray);
       return cArray;

    }

    private void createChar(char[] str1, char[] str2, int strIndex, int arrIndex, char[] cArray){
      if (strIndex < str1.length && strIndex < str2.length) {
        cArray[arrIndex++] = str1[strIndex];
        cArray[arrIndex++] = str2[strIndex++];
        createChar(str1, str2, strIndex, arrIndex, cArray);
      }


      else if (strIndex < str1.length){
        cArray[arrIndex++] = str1[strIndex++];
        createChar(str1, str2, strIndex, arrIndex, cArray);
      } else if (strIndex < str2.length) {
        cArray[arrIndex++] = str2[strIndex++];
        createChar(str1, str2, strIndex, arrIndex, cArray);
      }
    }
}
