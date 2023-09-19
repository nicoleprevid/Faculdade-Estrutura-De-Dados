
package projfila;

public class ProjFila {

    public static void main(String[] args) throws Exception {
        TADFila pessoas = new TADFila(10);
        
        pessoas.enqueue("MARIA");
        pessoas.enqueue("ENZO");
        pessoas.enqueue("LEO");
        System.out.println("Qnt de pessoas" + pessoas.size());
        System.out.println("Primeira pessoa na fila " + pessoas.front());
        
        System.out.println("os ultimos serão os primeiros");
        
        TADPilha novaPilha = new TADPilha(10);
        while (pessoas.size!=0){
            novaPilha.push(pessoas.front());
            pessoas.dequeue();
        }
        // da pilha para a fila 
        while (pessoas.size!=0){
            novaPilha.push(pessoas.front());
            pessoas.enqueue(novaPilha.top());
            novaPilha.pop();
        }
        System.out.println("Primeiro da fila" + pessoas.front());

    }
    
}
