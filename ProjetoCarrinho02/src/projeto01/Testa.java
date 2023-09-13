// Cleide Lustosa - 42218772
// Hyandra Teves - 42217954
// Nicole Previd - 42206774
package projeto01;

import java.util.*;
import java.io.*;

public class Testa {

    public static void main(String[] args) throws Exception {

        ArrayList<Produto> listaProd = new ArrayList<>();
        ArrayList<ItemCompra> itensCompra = new ArrayList<>();

        FileReader data = new FileReader("Produtos.txt");
        BufferedReader linha = new BufferedReader(data);
        String leitura = linha.readLine();

        int cont = 0;

        while (leitura != null) {
            String[] dados = leitura.split(";");

            Produto entrada = new Produto(Integer.parseInt(dados[0]),
                    dados[1], Double.parseDouble(dados[2]));
            listaProd.add(entrada);
            cont++;
            leitura = linha.readLine();
        }

        if (listaProd != null) {
            System.out.println("Arquivo de produtos carregado com sucesso!");
        } else {
            System.out.println("Arquivo de produtos não carregado!");
        }

        //Digitação
        Scanner entrada = new Scanner(System.in);
        Scanner entradaQnt = new Scanner(System.in);

        do {
            System.out.print("\nInforme o código do produto desejado: ");
            int codigoRecebido = entrada.nextInt();

            if (codigoRecebido == 99999) {
                System.out.println("Finalizando a compra!");
                break;
            } else {
                int flag = 0;
                for (int i = 0; i < listaProd.size(); i++) {
                    if (listaProd.get(i).codigo == codigoRecebido) {
                        String descricao = listaProd.get(i).descricao;
                        double preco = listaProd.get(i).preco;
                        System.out.println("Descrição: " + descricao);
                        flag = 1;
                        System.out.print("Informe a quantidade do produto: ");
                        int qntRecebida = entradaQnt.nextInt();

                        ItemCompra item = new ItemCompra(listaProd.get(i).descricao, listaProd.get(i).preco, qntRecebida);
                        itensCompra.add(item);
                    }
                }
                if (flag == 0) {
                    System.out.println("Produto inexistente!");
                }
            }
        } while (true);
        Carrinho carrinho = new Carrinho(itensCompra, 10.0);
        for (int i = 0; i < itensCompra.size(); i++){
            itensCompra.get(i).mostraItem();
        }

    }
}
