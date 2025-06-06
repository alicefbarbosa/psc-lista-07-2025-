package ListaVII;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vendasBrutas = new ArrayList<>();
        int[] faixas = new int[9];

        System.out.println("Digite as vendas brutas dos vendedores, para encerrar, digite -1: ");

        while (true){
            double venda = scanner.nextDouble();
            if (venda == -1) break;
            vendasBrutas.add(venda);
        }

        for (double venda : vendasBrutas){
            double salario = 200 + 0.09 * venda;

            int faixa;
            if (salario >= 1000){
                faixa = 8;
            } else{
                faixa = (int) (salario / 100) - 2;
            }

            if (faixa >= 0 && faixa < faixas.length){
                faixas[faixa]++;
            }
        }

        System.out.println("\nDistribuição de salários: ");
        String[] labels = {
            "$200 - $299",
            "$300 - $399",
            "$400 - $499",
            "$500 - $599",
            "$600 - $699",
            "$700 - $799",
            "$800 - $899",
            "$900 - $999",
            "$1000 ou mais"
        };

        for (int i = 0; i < faixas.length; i++){
            System.out.println(labels[i] + ": " + faixas[i] + " vendedor(es)");
        }

        scanner.close();
    }

}
