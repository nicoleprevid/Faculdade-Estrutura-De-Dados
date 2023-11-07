/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinária;

/**
 *
 * @author 42206774
 */
public class ProjectAB {

    public static void main(String[] args) throws Exception {
        ArvoreBinária diretorios = new ArvoreBinária();
        Node n1 = new Node("docs");
        diretorios.addRoot(n1);

        Node n2 = new Node("Pessoal");
        // n2 sera filho esquerdo de n1
        diretorios.addLeft(n2, n1);

        Node n3 = new Node("Trabalho");
        // n3 sera filho direito de n1
        diretorios.addRight(n3, n1);

        Node n4 = new Node("Viagem");
        // n4 sera filho direito de n2
        diretorios.addLeft(n4, n2);

        Node n5 = new Node("Contas");
        // n5 sera filho direito de n2
        diretorios.addRight(n5, n2);

        Node n6 = new Node("Emails");
        diretorios.addLeft(n6, n3);

        System.out.println("\n Percurso pré ordem");
        diretorios.visitaPreOrdem(diretorios.root());

        System.out.println("\n Percurso pós ordem");
        diretorios.visitaPosOrdem(diretorios.root());

        System.out.println(" \n Percurso em ordem");
        diretorios.visitaInOrdem(diretorios.root());

        System.out.print("\n Quantidade de folhas ");
        diretorios.contaFolha(diretorios.root());
        System.out.println(diretorios.qtDeFolhas);
    }
}
