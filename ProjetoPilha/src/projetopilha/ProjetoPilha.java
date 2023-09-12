package projetopilha;

public class ProjetoPilha {

    public static void main(String[] args) throws Exception {

        TADPilha p1 = new TADPilha(5);
        //segunda lista que inverte a primeira 
        TADPilha p2 = new TADPilha(5);
        //agora para não perdermos as informaçoes da primeira lista
        TADPilha p3 = new TADPilha(5);

        p1.push("A");
        p1.push("B");
        p1.push("C");
        p1.push("D");
        System.out.println("Topo p1 no inicio:" + p1.top());

        //inversao da p1
        while (!p1.isEmpty()) {
            p2.push(p1.top());
            //adiciona tudo tbm na p3 pra dps voltar pra p1
            p3.push(p1.top());
            p1.pop();
        }
        while (!p3.isEmpty()) {
            p1.push(p3.top());
            p3.pop();
        }
        System.out.println("Topo p2 (lista invertida):" + p2.top());
        System.out.println("Topo p1 continua:" + p1.top());
        
    }

}
