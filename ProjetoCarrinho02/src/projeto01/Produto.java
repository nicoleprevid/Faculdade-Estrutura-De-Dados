// Cleide Lustosa - 42218772
// Hyandra Teves - 42217954
// Nicole Previd - 42206774

package projeto01;

public class Produto {

    int codigo;
    String descricao;
    double preco;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public void mostraProduto(){
        System.out.println("\n\nCódigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço Unitário: " + preco);
    }
}
