package ListaVII;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        double[] temperaturas = new double[12];
        double soma = 0;

        System.out.println("Digite a temperatura  média de cada mês: ");
        for (int i = 0; i< 12; i++) {
            System.out.print((i + 1) + " - " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double mediaAnual = soma / 12;
        System.out.printf("\nMédia anual: %.2fºC\n", mediaAnual);
        System.out.println("\nMeses com temperautra acima da média: ");
        for (int i=0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual){
                System.out.printf("%d - %s: %.2fºC\n", (i + 1), meses[i], temperaturas[i]);
            }
        }

        scanner.close();
    }
}