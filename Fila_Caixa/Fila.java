package Fila_Caixa;

public class Fila extends Vetor {

   public Fila(int capacity) {
      super(capacity);
   }

   public int size() {
      return super.size();
   }

   public void enqueue(int n) throws Exception {
      int pos = super.size();
      this.add(pos, n);
   }

   public void dequeue() throws Exception {
      this.remove(0);
   }

   public int front() throws Exception {
      return this.get(0);
   }
}
