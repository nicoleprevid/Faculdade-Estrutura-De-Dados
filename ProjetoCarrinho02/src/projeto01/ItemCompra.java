// Cleide Lustosa - 42218772
// Hyandra Teves - 42217954
// Nicole Previd - 42206774

package projeto01;

public class ItemCompra {
    String descricao;
    int qtde;
    double preco;
  
    
    
    public ItemCompra(String descricao, double preco, int qtde){
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public void mostraItem(){
        System.out.println("\nDescrição: " + descricao + " Quantidade: " + qtde + " Preço: " + preco + " Subtotal: " + calcSubtotal(qtde, preco));
    }
    
    public double calcSubtotal(int qtde, double preco){
            double subtotal = qtde * preco;
            return subtotal;
    }
}
