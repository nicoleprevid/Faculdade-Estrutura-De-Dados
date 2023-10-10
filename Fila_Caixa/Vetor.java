package Fila_Caixa;

public class Vetor {
    int[] A;
    int capacity;
    int size;

    public Vetor(int capacity) {
        this.A = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public int get(int i) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Lista vazia!");
        } else {
            return this.A[i];
        }
    }

    public void set(int i, int n) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Lista vazia!");
        } else {
            this.A[i] = n;
        }
    }

    public void add(int i, int n) throws Exception {
        if (this.size == this.A.length) {
            throw new Exception("Lista cheia!");
        } else {
            for (int j = this.size - 1; j >= i; --j) {
                this.A[j + 1] = this.A[j];
            }

            this.A[i] = n;
            ++this.size;
        }
    }

    public void remove(int i) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Lista Vazia!");
        } else {
            for (int j = i; j <= this.size - 2; ++j) {
                this.A[j] = this.A[j + 1];
            }

            --this.size;
        }
    }

    public int search(int n) {
        for (int i = 0; i < this.A.length; ++i) {
            if (this.A[i] == n) {
                return i;
            }
        }

        return -1;
    }
}
