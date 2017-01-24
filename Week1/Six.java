/*
Binomialkoefficienterna definieras enligt nedan.
Skriv en rekursiv funktion som beräknar binomialkoefficienterna.

N över K =
            0   if K < 0 || n < k
            1   if K = 0 || n = k
            Annars
            (N-1 över K-1) + (N-1 över K)

*/


public class Six {

  public void printAnswer(int n, int k) {
    System.out.println(nOverK(n, k));
  }

  public int nOverK(int n, int k) {
    if (k < 0 || n < k) return 0;
    if (k == 0 || n == k) return 1;
    return nOverK(n-1, k-1) + nOverK(n-1 , k);
  }

}
