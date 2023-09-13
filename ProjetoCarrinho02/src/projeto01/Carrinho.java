package projeto01;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<ItemCompra> listaItens;
    
    double totalCompra;
    double porcDesconto;
    double valorPagar;

    public Carrinho(ArrayList<ItemCompra> listaItens, double porcDesconto) {
        this.listaItens = listaItens;
        this.porcDesconto = porcDesconto;
        totalCompra = 0;
        valorPagar = 0;
    }
    
    
    
    public void mostraCarrinho(){
        
    }
    
    public void calcDesconto(){
        
    }
    
    public void somaValores(){
        
    }

}
