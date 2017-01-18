package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
public class Second {

    public void freakCount(){
        String str = null;
        StringBuffer sBuffer = new StringBuffer("/Users/felixjansson/develop/Weekly-TDA416/src/com/company/txt");

        try {
            str = Files.lines(path, StandardCharsets.UTF_8).forEach();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(str.to);
    }
}
