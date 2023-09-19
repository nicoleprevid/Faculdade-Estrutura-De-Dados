
package projfila;

public class ProjFila {

    public static void main(String[] args) throws Exception {
        TADFila pessoas = new TADFila(10);
        
        pessoas.enqueue("MARIA");
        pessoas.enqueue("ENZO");
        pessoas.enqueue("LEO");
        System.out.println("Qnt de pessoas" + pessoas.size());
        System.out.println("Primeira pessoa na fila " + pessoas.front());
        //deleta a primeira da lista
        pessoas.dequeue();
        System.out.println("Primeira pessoa na fila " + pessoas.front());
       

    }
    
}
