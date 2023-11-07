package arvorebinária;

public class ArvoreBinária {

    Node root;
    int qtDeFolhas;
    ArvoreBinária() {
        // Cria uma árvore binária vazia
        root = null;
        qtDeFolhas = 0;
    }

    public boolean isEmpty() {
        // verifica se a árvore está vazia
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addRoot(Node e) throws Exception {
        // adiciona o Nó e como raiz
        root = e;
    }

    public Node root() {
        //retorna a raiz da árvore
        return root;

    }

    public boolean isInternal(Node e) {
        // verifica se o nó e é interno ou não
        if (e.left != null || e.right != null) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isLeaf(Node e) {
        // verifica se o nó e é folha ou não
        if (e.left == null && e.right == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addLeft(Node e, Node m) throws Exception {
        // trow exception pra quando ja existe um filho a esquerda
        // adiciona e como filho esquerdo de m
        // e = filho;
        // m  = pai;
        // um nó é o que ja esta na arvore e outro é o filho que esta nascendo
        if (m.left != null) {
            throw new Exception("Esse nó já tem filho esquerdo");
        }
        // apontando um nó ao outro
        e.parent = m;
        m.left = e;

    }

    public Node left(Node e) {
        // retorna o filho à esquerda de e
        // manda um nó qualuqer e retorna quem esta a esquerda
        return e.left;

    }

    public boolean hasLeft(Node e) {
        // verifica se e tem ou naõ filho à esquerda
        if (e.left != null) {
            return true;
        } else {
            return false;
        }

    }

    public void addRight(Node e, Node m) throws Exception {
        // adiciona e como filho direito de m
        // e = filho
        // m  = pai
        if (m.right != null) {
            throw new Exception("Esse nó já tem filho esquerdo");
        }
        // apontando um nó ao outro
        e.parent = m;
        m.right = e;
    }

    public Node right(Node e) {
        // retorna o filho à direita de e
        return e.right;
    }

    public boolean hasRight(Node e) {
        // verifica se e tem ou não filho à direita
        if (e.right != null) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(Node e) {
        //remove o e com todos os descendentes
        if (e == root) {
            root = null;
        } else {
            // filho do pai agr sera null
            // preciso descobrir se é esquerda ou direito 
            if (e.parent.left == e) {
                e.parent.left = null;
            } else {
                e.parent.right = null;
            }

        }

    }

    public void visitaPreOrdem(Node e) {
        // exibe todos os nós na forma RED
        if (e == null) {
            return;
        }
        //exibe raiz
        e.exibeNo();

        // chama a si mesmo agr com a esquerda da raiz exibe esquerda
        visitaPreOrdem(e.left);

        //exibe direita
        visitaPreOrdem(e.right);

    }

    public void visitaPosOrdem(Node e) {
        // exibe todos os nós na forma EDR
        if (e == null) {
            return;
        }
        //exibe esquerda
        visitaPosOrdem(e.left);

        //exibe direita
        visitaPosOrdem(e.right);

        //exibe raiz
        e.exibeNo();

    }

    public void visitaInOrdem(Node e) {
        // exibe todos os nós na forma ERD
        if (e == null) {
            return;
        }

        //exibe esquerda
        visitaInOrdem(e.left);

        //exibe raiz
        e.exibeNo();

        //exibe direita
        visitaInOrdem(e.right);

    }

    public void contaFolha(Node e) {
        // conta e retorna a quantidade de folhas
        int count = 0;
        if (e == null) {
            return;
        }

        contaFolha(e.left);

        contaFolha(e.right);
        
        if (isLeaf (e))
            qtDeFolhas++;
    }
}
