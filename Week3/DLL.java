public class DLL<E> {
  /**
  ** Intern representation of node in Tree
  */
  protected static class Node<E> {
    protected E nbr;
    protected Node<E> prev;
    protected Node<E> next;

    public Node(E nbr){
      this.nbr = nbr;
      this.prev = null;
      this.next = null;
    }

    public String toString(){
      return nbr+" ";
    }
  }
  /*
  ** End of Node
  */

  protected Node<E> root;
  protected int size;
  protected int mte;

  public DLL(){
    root = null;
  }

  public DLL(int mte, int size){
    this.mte = mte;
    this.size = size;
    createList();
    removeMte();
  }

  private void createList(){
    this.root = new Node(1);
    Node prev = root;
    Node current = null;
    for (int i = 2 ; i <= size ; i++ ) {
      current = new Node(i);
      current.prev = prev;
      prev.next = current;
      prev = current;
    }
    current.next = root;
    root.prev = current;
  }

  private void removeMte(){
    Node current = root.next;
    int step = 2;
    String str = "";
    while(current != null){
      if ((step % mte) == 0) {
        str += current.toString();
        Node tmp = current;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current = current.next;
        tmp.prev = null;
        tmp.next = null;
      } else {
        current = current.next;
      }
      step++;
    }
    System.out.println(str);
  }

}
