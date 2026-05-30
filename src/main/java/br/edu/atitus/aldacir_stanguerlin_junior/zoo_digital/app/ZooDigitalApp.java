package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.app;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooDigitalApp {
    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        carregarAnimaisIniciais();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            IO.println("\n" + "=".repeat(40));
            IO.println("        ZOO DIGITAL");
            IO.println("=".repeat(40));
            IO.println("1 - Cadastrar Animal");
            IO.println("2 - Listar Todos os Animais");
            IO.println("3 - Listar Animais Corredores");
            IO.println("4 - Listar Animais Nadadores");
            IO.println("5 - Listar Animais Voadores");
            IO.println("6 - Listar Animais Predadores");
            IO.println("7 - Exibir Total de Animais");
            IO.println("0 - Sair");
            IO.println("-".repeat(40));
            IO.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAnimal(sc);
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 0 -> IO.println("\nEncerrando Zoo Digital...");
                default -> IO.println("Opcao invalida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void carregarAnimaisIniciais() {
        // Mamiferos
        animais.add(new Cachorro("Cachorro Toto", 5));
        animais.add(new Gato("Gata Mimi", 8));
        animais.add(new Golfinho("Golfinho Flipper", 20));
        animais.add(new Bugio("Bugio Jorjão", 4));
        animais.add(new Coala("Coala Kuro", 3));

        // Aves
        animais.add(new Pato("Pato Donald", 3, "Branca"));
        animais.add(new Pinguim("Pinguim Pingu", 4, "Preto e Branco"));
        animais.add(new Ema("Ema Cleide", 6, "Marrom"));
        animais.add(new Harpia("Harpia Elizabeth", 10, "Cinza"));

        // Peixes
        animais.add(new PeixeMorcego("Peixe Morcego Drako", 2));
        animais.add(new Traira("Traira Judas", 3));
        animais.add(new Pirarucu("Pirarucu Cleber", 5));
        animais.add(new Tucunare("Tucunare Bocão", 4));

        // Repteis
        animais.add(new Jabuti("Jabuti", 30));
        animais.add(new JacareAcu("Jacare", 15));
        animais.add(new Sucuri("Sucuri", 8));
        animais.add(new Teiu("Teiu", 5));

        IO.println("Total de animais carregados: " + Animal.getContador());
    }

    private static void cadastrarAnimal(Scanner sc) {
        IO.println("\n" + "=".repeat(40));
        IO.println("      CADASTRAR ANIMAL");
        IO.println("=".repeat(40));

        IO.println("\nTipos disponiveis:");
        IO.println("1 - Mamifero");
        IO.println("2 - Ave");
        IO.println("3 - Peixe");
        IO.println("4 - Reptil");
        IO.print("Escolha o tipo: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        IO.print("Nome: ");
        String nome = sc.nextLine();

        IO.print("Idade (anos): ");
        int idade = sc.nextInt();
        sc.nextLine();

        Animal novoAnimal = null;

        switch (tipo) {
            case 1 -> novoAnimal = cadastrarMamifero(sc, nome, idade);
            case 2 -> novoAnimal = cadastrarAve(sc, nome, idade);
            case 3 -> novoAnimal = cadastrarPeixe(sc, nome, idade);
            case 4 -> novoAnimal = cadastrarReptil(sc, nome, idade);
            default -> IO.println("Tipo invalido!");
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            IO.println("\nAnimal cadastrado com sucesso!");
            IO.println(novoAnimal.toString());
        }
    }

    private static Animal cadastrarMamifero(Scanner sc, String nome, int idade) {
        IO.println("\nMamiferos disponiveis:");
        IO.println("1 - Cachorro | 2 - Gato | 3 - Golfinho | 4 - Bugio | 5 - Coala");
        IO.print("Escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: return new Cachorro(nome, idade);
            case 2: return new Gato(nome, idade);
            case 3: return new Golfinho(nome, idade);
            case 4: return new Bugio(nome, idade);
            case 5: return new Coala(nome, idade);
            default:
                IO.println("Opcao invalida!");
                return null;
        }
    }

    private static Animal cadastrarAve(Scanner sc, String nome, int idade) {
        IO.println("\nAves disponiveis:");
        IO.println("1 - Pato | 2 - Pinguim | 3 - Ema | 4 - Harpia");
        IO.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        IO.print("Cor das penas: ");
        String corPenas = sc.nextLine();

        switch (opcao) {
            case 1: return new Pato(nome, idade, corPenas);
            case 2: return new Pinguim(nome, idade, corPenas);
            case 3: return new Ema(nome, idade, corPenas);
            case 4: return new Harpia(nome, idade, corPenas);
            default:
                IO.println("Opcao invalida!");
                return null;
        }
    }

    private static Animal cadastrarPeixe(Scanner sc, String nome, int idade) {
        IO.println("\nPeixes disponiveis:");
        IO.println("1 - Peixe-Morcego | 2 - Traira | 3 - Pirarucu | 4 - Tucunare");
        IO.print("Escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: return new PeixeMorcego(nome, idade);
            case 2: return new Traira(nome, idade);
            case 3: return new Pirarucu(nome, idade);
            case 4: return new Tucunare(nome, idade);
            default:
                IO.println("Opcao invalida!");
                return null;
        }
    }

    private static Animal cadastrarReptil(Scanner sc, String nome, int idade) {
        IO.println("\nRepteis disponiveis:");
        IO.println("1 - Jabuti | 2 - Jacare-Acu | 3 - Sucuri | 4 - Teiu");
        IO.print("Escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: return new Jabuti(nome, idade);
            case 2: return new JacareAcu(nome, idade);
            case 3: return new Sucuri(nome, idade);
            case 4: return new Teiu(nome, idade);
            default:
                IO.println("Opcao invalida!");
                return null;
        }
    }

    private static void listarTodos() {
        IO.println("\n" + "=".repeat(50));
        IO.println("        TODOS OS ANIMAIS");
        IO.println("=".repeat(50));

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado!");
            return;
        }

        for (int i = 0; i < animais.size(); i++) {
            Animal animal = animais.get(i);
            IO.println("\nAnimal #" + (i+1));
            IO.println(animal.toString());
            animal.emitirSom();
            animal.comer();
            IO.println("-".repeat(40));
        }
    }

    private static void listarCorredores() {
        IO.println("\n" + "=".repeat(50));
        IO.println("        ANIMAIS CORREDORES");
        IO.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                encontrou = true;
                IO.println("\n" + animal);
                ((Corredor) animal).correr();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal corredor encontrado!");
        }
    }

    private static void listarNadadores() {
        IO.println("\n" + "=".repeat(50));
        IO.println("        ANIMAIS NADADORES");
        IO.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Nadador) {
                encontrou = true;
                IO.println("\n" + animal);
                ((Nadador) animal).nadar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal nadador encontrado!");
        }
    }

    private static void listarVoadores() {
        IO.println("\n" + "=".repeat(50));
        IO.println("        ANIMAIS VOADORES");
        IO.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Voador) {
                encontrou = true;
                IO.println("\n" + animal);
                ((Voador) animal).voar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal voador encontrado!");
        }
    }

    private static void listarPredadores() {
        IO.println("\n" + "=".repeat(50));
        IO.println("        ANIMAIS PREDADORES");
        IO.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                encontrou = true;
                IO.println("\n" + animal);
                ((Predador) animal).cacar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal predador encontrado!");
        }
    }

    private static void exibirTotal() {
        IO.println("\n" + "=".repeat(50));
        IO.println("        ESTATISTICAS");
        IO.println("=".repeat(50));
        IO.println("Total de animais no sistema: " + Animal.getContador());
        IO.println("Animais na lista atual: " + animais.size());
        IO.println("=".repeat(50));
    }
}