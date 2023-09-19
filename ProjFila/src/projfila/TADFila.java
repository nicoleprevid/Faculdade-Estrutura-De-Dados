
package projfila;

/**
 *
 * @author 42206774
 */
public class TADFila extends TADVetor1{
    
    public TADFila (int capacity){
        super(capacity);
        
    }
    public void enqueue(String novo)throws Exception{
        add(size(),novo);
    }
    public void dequeue()throws Exception{
        remove(0);
    }
    public String front()throws Exception{
        return get(0);
    }
}
