public class SLL<E> {
  /*
  ** Intern class representing tree Node
  */
    protected static class Node<E> {
      protected E nbr;
      protected Node<E> next;

       public Node(E nbr){
        this.nbr = nbr;
        this.next = null;
      }

      public String toString(){
      return (nbr+ "");
      }
    }
/*
** End of Node
** Implementation of SLL
*/
  protected Node<E> root;;
  private int size;
  private int mte;

  public SLL(){
    this.root = null;
  }

  public SLL(int mte, int size ){
      this.size = size;
      this.mte = mte;
      createList(size);
      removeMte(mte);
    }

    private void createList(int size){
      Node changeNode = new Node(1);
      Node nextNode = null;
      this.root = changeNode;
      for (int i = 2; i <= size; i++ ) {
        nextNode = new Node(i);
        changeNode.next = nextNode;
        changeNode = nextNode;
      }
      changeNode.next = this.root;
    }

    private void removeMte(int mte){
      Node prev = root;
      Node current = prev.next;
      int step = 2;
      String str = "";
      while (current != null){
        if ((step % mte) == 0) {
          str += current.toString() + ",";
          prev.next = current.next;
          current.next = null;
          current = prev.next;
        } else {
          prev = current;
          current = current.next;
        }
        step++;
    }
    System.out.println(str);
  }
}
