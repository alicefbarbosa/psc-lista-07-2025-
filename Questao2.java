package ListaVII;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<String> respostas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        System.out.println("Responda com 'sim' ou 'não': ");

        for (String pergunta : perguntas){
            System.out.print(pergunta + " ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            respostas.add(resposta);
        }

        int positivas = 0;
        for (String resposta : respostas){
            if (resposta.equals("sim")){
                positivas++;
            }
        }

        System.out.println("\nClassificação: ");
        if (positivas == 2){
            System.out.println("Suspeita");
        } else if (positivas == 3 || positivas == 4){
            System.out.println("Cúmplice");
        } else if (positivas == 5){
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        scanner.close();
    }

}
