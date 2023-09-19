/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projfila;
public class TADVetor1 {

    String[] A; // armazena os elementos do vetor (tipo da lista)
    int capacity; // capacidade do vetor (física)
    int size; // elementos no vetor

    public TADVetor1(int capacity) {
        A = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        //verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        //retorna quantos elementos existem no vetor
        return size;
    }

    public String get(int i) throws Exception {
        //retorna o conteúdo da posição i do vetor
        if (i >= size) {
            throw new Exception("Posição inexistente");
        }
        return A[i];
    }

    public void set(int i, String n) throws Exception {
        //altera o conteúdo da posição i pelo valor de n
        if (i >= size) {
            throw new Exception("Posição inexistente");
        }
        A[i] = n;
    }

    public void add(int i, String n) throws Exception {
        //insere n na posição i 
        if (i > size) {
            throw new Exception("Posição iválida para inserção...");
        }
        if (size == capacity) {
            throw new Exception("Não há mais espaço no vetor...");
        }
        for (int j = size - 1; j >= i; j--) {
            A[j + 1] = A[j];
        }
        A[i] = n;
        size++;
    }

    public void remove(int i) throws Exception {
        //exclui a posição i do vetor
        if (i > size) {
            throw new Exception("Posição inválida para exclusão...");
        }
        if (isEmpty()) {
            throw new Exception("Lista vazia... impossível excluir");
        }
        for (int j = i; j <= size; j++) {
            A[j] = A[j + 1];
        }
        size--;
    }

    public int search(String n) {
        //busca n no vetor A
        for (int i = 0; i < size; i++) {
            if (A[i].equals(n)) {
                return i;
            }
        }
        return -1;
    }

    public void mostraArray() {
        //exibe o conteúdo da lista
       for (int i = 0; i < size; i++){
           System.out.print(A[i] + " - ");
       }
        System.out.println("FIM DA LISTA");
    }
}
