package ListaVII;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double nota;

        System.out.println("Digite as notas e aperte -1 para encerrar: ");

        while (true){
            nota = scanner.nextDouble();
            if (nota == -1){
                break;
            }
            notas.add(nota);
        }

        System.out.println("\nQuantidade de notas lidas: " + notas.size());

        System.out.print("Notas na ordem em que foram informadas: ");
        for (double n : notas){
            System.out.print(n + " ");
        }

        System.out.println("\n\nNotas na ordem inversa: ");
        for (int i = notas.size() - 1; i >= 0; i--){
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double n : notas){
            soma += n;
        }

        double media = (notas.size() > 0) ? soma / notas.size() : 0;
        System.out.printf("\nSoma das notas: %.2f\n", soma);
        System.out.printf("Média das notas: %.2f\n", media);

        int acimaMedia = 0;
        int abaixoSete = 0;
        for (double n : notas){
            if (n > media) acimaMedia++;
            if (n < 7) abaixoSete++;
        }

        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        System.out.println("Quantidade de notas abaixo de sete: " + abaixoSete);

        System.out.println("\nPrograma finalizado com sucesso.");
        scanner.close();
    }
}
