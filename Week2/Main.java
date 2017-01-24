public class Main {
  public Main() {}

  private static void one() {
    One one = new One();

    int[] f = new int[10000];
    for (int i = 0; i < f.length; i++) {
      f[i] = i*2;
    }
    int x = 9000;

    System.out.println(one.check(f, x));

  }

  public static void main(String[] args) {
      one();
  }
}
