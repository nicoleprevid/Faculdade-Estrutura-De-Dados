package projetopilha;

public class TADPilha extends TADVetor {

    int topo; // topo da pilha

    public TADPilha(int capacity) {
// Cria uma pilha com uma capacidade inicial
        super(capacity);
        topo = -1;
    }

    public void push(String n) throws Exception {
        // Empilha, caso a pilha não esteja cheia, o elemento n
        topo++; // topo via pra 0 
        add(topo, n); // (posicao, valor) posicao é 0 dps 1,2,3,4
    }

    public void pop() throws Exception {
        // Desempilha, caso a pilha não esteja vazia, o elemento do topo
        remove(topo);
        topo--;
    }

    public String top() throws Exception {
        // Devolve (não desempilha)o elemento do topo se a pilha não estiver vazia
        return get(topo);
    }
}
}
