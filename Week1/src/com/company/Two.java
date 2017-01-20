package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Skriv ett program som kan läsa en text från en fil och göra frekvensanalys på de bokstäver (även 'å', 'ä' och 'ö') som förekommer.
För att lagra information, får ni inte använda någon datastruktur i util-paketet, utan endast använda variabler och fält. Utdata skall ges i form av en tabell:
boks antal frekv
a    112   9.33
b    15    1.25
. ... ...
och så vidare.
Frekvensen anges i % och endast bokstäver som förekommer minst 1 gång tas med.
Texter på olika språk har en karaktäristisk frekvensfördelning (som jag inte kommer ihåg).
Se om ni kan se någon skillnad på engelsk respektive svensk text genom att testa med någon lite större lämplig text på vardera språket.
 */
public class Two {
    //å 229
    //ä 228
    //ö 246

    private int total;

    public void freakCount(Path path){
        int[] iArray = mapChar(getChars(path));
        print(iArray);

    }

    private void print(int[] iArray) {
        System.out.println("Char\tTotal\tHz");
        for (char i = 0; i < 26;i++){
            if (iArray[i] > 0){
                char c = (char)(i + 97);
                double percent = (double) iArray[i]/total;
                System.out.println(c + "\t\t" + iArray[i] + "\t\t" + percent);
            }
        }
        for (char i = 26; i < 29; i++){
            if (i == 26 && iArray[i] > 0){
                double percent = (double)iArray[i]/total;
                System.out.println("å\t\t" + iArray[i] + "\t\t" + percent);
            } else if (i == 27 && iArray[i] > 0){
                double percent = (double)iArray[i]/total;
                System.out.println("ä\t\t" + iArray[i] + "\t\t" + percent);
            } else if (i == 28 && iArray[i] > 0){
                double percent =(double) iArray[i]/total;
                System.out.println("ö\t\t" + iArray[i] + "\t\t" + percent);
            }
        }
    }

    private int[] mapChar(char[] cArray){
        int[] map = new int[29];
        total = 0;
        for (char i = 0 ; i < map.length; i++){
            map[i] = 0;
        }
        for (char c : cArray){
            if (c >= 97 && c <= 122){
                map[c - 97]++;
                total++;
            }
            switch (c) {
                case 229:
                    map[26]++;
                    total++;
                    break;
                case 228:
                    map[27]++;
                    total++;
                    break;
                case 246:
                    map[28]++;
                    total++;
                    break;
            }
        }
        return map;
    }

    private char[] getChars(Path path){
        byte[] fileArray = null;
        try{
            fileArray = Files.readAllBytes(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
        String tmp = new String(fileArray);
        tmp = tmp.toLowerCase();
        return tmp.toCharArray();
    }
}
