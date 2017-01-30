
/*
I Java finns ju slumptalsgeneratorn Math.random() som ger ett flyttal (double) i intervallet [0.0,1.0) med uniform distribution.
 Gör en egen variant av denna som istället ger heltal mellan ”min” och ”max” som resultat (”min” och ”max” är parametrar).
 Prova sedan metoden genom att anropa den olika antal gånger,
  samt skriv för varje gång ut en tabell som visar den relativa frekvensen för varje möjligt värde.
*/

public class Ffive{

  public int rand(int min, int max){
    if (max <= min){
      System.out.println("ERROR: max <= min ");
      return -1;
    }

    int sysTime = (int) System.nanoTime();

    int tmpMod = (max - min);

    return (sysTime % tmpMod) + min;

  }
}
