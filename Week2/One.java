public class One {

  int index = 0;

  public boolean check(int[] f, int x) {

    int max = f.length-1;
    int min = 0;

    /*while (f[max] > x) {
      max--;
      index++;
    }*/

    boolean found = loop(f, x, min, max);

    System.out.println("Times looped: " + index);

    return found;
  }

  private void printAll(int min, int max) {
    System.out.println("Min = " + min + "\tMax = " + max);
  }

  private boolean loop(int[] f, int x, int min, int max) {

    index++;
    if (max == min) return false;
  	if (f[max] + f[min]  == x) return true;
    if (f[max] + f[min] < x) min++;
  	if (f[max] + f[min] > x) max--;

    return loop(f, x, min, max);
  }
}
