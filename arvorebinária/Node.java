package arvorebinária;

public class Node{
    
    String elemento;
    Node left, right, parent;
    
    Node (String elemento){
        this.elemento = elemento;
        // todos serao inicializados com null
        left = right = parent = null;
    }
    public void exibeNo(){
        System.out.print (" "+ elemento);
    }
    
}
