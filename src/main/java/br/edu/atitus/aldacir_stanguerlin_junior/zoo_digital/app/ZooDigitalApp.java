package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.app;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.Animal;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooApp {
    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Zoo Digital ===");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrarAnimal(sc);
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 0 -> System.out.println("Encerrando sistema zoo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    // Métodos para cada funcionalidade (a implementar)
    private static void cadastrarAnimal(Scanner sc) {}
    private static void listarTodos() {}
    private static void listarCorredores() {}
    private static void listarNadadores() {}
    private static void listarVoadores() {}
    private static void listarPredadores() {}
    private static void exibirTotal() {}
}

