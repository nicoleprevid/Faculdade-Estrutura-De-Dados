package Fila_Caixa;

import java.util.Random;

public class Fila_Caixa {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila(10); // Criar uma fila vazia
        //Ps:  Tempo estimado pra cada cliente é um minuto
        int periodoDeTempo = 50; // Tempo de execução
        int clientesAtendidos = 0;
        int tempoTotalEspera = 0;
        int maiorTempoEspera = 0;
        

        System.out.println("Minuto | Fila Vazia? | K | Operação | Ação");

        for (int minuto = 0; minuto < periodoDeTempo; minuto++) {
            boolean filaVazia = fila.isEmpty();
            int pessoa = minuto; // o nome da pessoa vai ser o minuto que ela entrou 
            // Gere um número aleatório k entre 0 e 2 (inclusive)
            Random random = new Random();
            int k = random.nextInt(2);

            // sai uma pessoa a cada minuto
            if (!fila.isEmpty()) {
                fila.dequeue();
            }
            // entra pessoas 
            if (k == 1) {
                fila.enqueue(pessoa); // Adicione um cliente na fila
                System.out.println(minuto + " | " + filaVazia + " | " + k + " | enqueue | entra na fila");
            } else if (k == 2) {
                fila.enqueue(pessoa); // Adicione dois clientes na fila
                fila.enqueue(pessoa);
                System.out.println(minuto + " | " + filaVazia + " | " + k + " | enqueue | entra na fila");
            } else {
                System.out.println(minuto + " | " + filaVazia + " | " + k + " | nenhuma | nenhuma");
            }

            if (!fila.isEmpty()) {
                int tempoEspera = clientesAtendidos++;
                tempoTotalEspera += tempoEspera;
                if (tempoEspera > maiorTempoEspera) {
                    maiorTempoEspera = tempoEspera;
                }
                System.out.println(minuto + " | " + filaVazia + " | " + k + " | dequeue | sai da fila");
            }
        }

        // Imprima os resultados
        System.out.println("Resultado da Simulação:");
        System.out.println("Número total de clientes atendidos: " + clientesAtendidos);
        System.out.println("Tempo médio de espera na fila: " + (tempoTotalEspera / clientesAtendidos) + " minutos");
        System.out.println("Maior tempo de espera na fila: " + maiorTempoEspera + " minutos");
    }
}