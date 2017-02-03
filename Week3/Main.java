public class Main{

  private static void sll(String sMte, String sSize) throws NumberFormatException {
    int mte = Integer.parseInt(sMte);
    int size = Integer.parseInt(sSize);
    SLL sll = new SLL(mte, size);
  }

  public static void main(String[] args) {
    try {
      sll(args[0], args[1]);
    } catch (NumberFormatException e){
      System.out.println(e.getMessage());
    }
  }
}
