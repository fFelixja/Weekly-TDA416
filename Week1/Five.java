/*

I Java finns ju slumptalsgeneratorn Math.random() som ger ett flyttal (double) i intervallet [0.0,1.0)
med uniform distribution. Gör en egen variant av denna som istället ger heltal mellan
”min” och ”max” som resultat (”min” och ”max” är parametrar). Prova sedan metoden genom att anropa den olika antal gånger
samt skriv för varje gång ut en tabell som visar den relativa frekvensen för varje möjligt värde.

Titta också på klassen java.util.Random som är lite mer kraftfull
(men den skall ni inte använda för att lösa den här uppgiften :-) )

*/

import java.lang.*;
import java.util.*;

public class Five {

  public Five() {}


  public int myRandom(int min, int max) {
    int nanoS = (int)System.nanoTime();

    if (nanoS < 0) nanoS = -nanoS;

    /* tar ut ett tal i intervallet [min, max] och försjuter det till rätt värde */
    nanoS = nanoS%(max-min+1) + min;


    return nanoS;
  }


  public void tabel(int min, int max, int times) {

    Map<Integer, Integer> map = new HashMap(max - min);
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < times ; i++) {
      int current = myRandom(min, max);
      if (map.containsKey(current)) {
        map.put(current, map.get(current) + 1);
      } else {
        map.put(current, 1);
        list.add(current);
      }
    }

    Collections.sort(list);

    System.out.println("In " + times + " times :");

    for (int a : list) {
      System.out.println("" + a + "\tappered\t" + map.get(a) + ((map.get(a) == 1) ? "\ttime." : "\ttimes."));

    }

  }

}
