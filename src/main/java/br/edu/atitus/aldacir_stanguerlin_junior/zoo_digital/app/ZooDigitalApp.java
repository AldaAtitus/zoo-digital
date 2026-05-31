package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.app;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooDigitalApp {
    private static final List<Animal> animais = new ArrayList<>();

    static void main(String[] args) {
        carregarAnimaisIniciais();

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n" + "=".repeat(40));
            System.out.println("        ZOO DIGITAL");
            System.out.println("=".repeat(40));
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos os Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.println("-".repeat(40));
            System.out.print("Escolha uma opcao: ");

            try {
                opcao = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um numero valido!");
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAnimal(sc);
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 0 -> System.out.println("\nEncerrando Zoo Digital...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void carregarAnimaisIniciais() {
        // Mamiferos
        animais.add(new Cachorro("Cachorro Toto", 5));
        animais.add(new Gato("Gata Mimi", 8));
        animais.add(new Golfinho("Golfinho Flipper", 20));
        animais.add(new Bugio("Bugio Jorjao", 4));
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
        animais.add(new Tucunare("Tucunare Bocao", 4));

        // Repteis
        animais.add(new Jabuti("Jabuti", 30));
        animais.add(new JacareAcu("Jacare", 15));
        animais.add(new Sucuri("Sucuri", 8));
        animais.add(new Teiu("Teiu", 5));

        System.out.println("Total de animais carregados: " + Animal.getContador());
    }

    private static void cadastrarAnimal(Scanner sc) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("      CADASTRAR ANIMAL");
        System.out.println("=".repeat(40));

        System.out.println("\nTipos disponiveis:");
        System.out.println("1 - Mamifero");
        System.out.println("2 - Ave");
        System.out.println("3 - Peixe");
        System.out.println("4 - Reptil");
        System.out.print("Escolha o tipo: ");

        int tipo;
        try {
            tipo = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um numero valido!");
            sc.nextLine();
            return;
        }
        sc.nextLine();

        // VALIDA PRIMEIRO
        if (tipo < 1 || tipo > 4) {
            System.out.println("Opcao invalida! Escolha um numero disponivel.");
            return;
        }

        // SO PERGUNTA NOME E IDADE SE TIPO FOR VALIDO
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        // VALIDA NOME
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio!");
            return;
        }

        System.out.print("Idade (anos): ");
        int idade;
        try {
            idade = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um numero valido para a idade!");
            sc.nextLine();
            return;
        }
        sc.nextLine();

        // VALIDA IDADE
        if (idade < 0) {
            System.out.println("Erro: Idade não pode ser negativa!");
            return;
        }

        Animal novoAnimal = null;

        switch (tipo) {
            case 1 -> novoAnimal = cadastrarMamifero(sc, nome, idade);
            case 2 -> novoAnimal = cadastrarAve(sc, nome, idade);
            case 3 -> novoAnimal = cadastrarPeixe(sc, nome, idade);
            case 4 -> novoAnimal = cadastrarReptil(sc, nome, idade);
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            System.out.println("\nAnimal cadastrado com sucesso!");
            System.out.println(novoAnimal);
        }
    }

    private static Animal cadastrarMamifero(Scanner sc, String nome, int idade) {
        System.out.println("\nMamiferos disponiveis:");
        System.out.println("1 - Cachorro | 2 - Gato | 3 - Golfinho | 4 - Bugio | 5 - Coala");
        System.out.print("Escolha: ");

        int opcao;
        try {
            opcao = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um numero valido!");
            sc.nextLine();
            return null;
        }

        return switch (opcao) {
            case 1 -> new Cachorro(nome, idade);
            case 2 -> new Gato(nome, idade);
            case 3 -> new Golfinho(nome, idade);
            case 4 -> new Bugio(nome, idade);
            case 5 -> new Coala(nome, idade);
            default -> {
                System.out.println("Opcao invalida!");
                yield null;
            }
        };
    }

    private static Animal cadastrarAve(Scanner sc, String nome, int idade) {
        System.out.println("\nAves disponiveis:");
        System.out.println("1 - Pato | 2 - Pinguim | 3 - Ema | 4 - Harpia");
        System.out.print("Escolha: ");

        int opcao;
        try {
            opcao = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um numero valido!");
            sc.nextLine();
            return null;
        }
        sc.nextLine();

        // VALIDA PRIMEIRO
        if (opcao < 1 || opcao > 4) {
            System.out.println("Opcao invalida! Escolha um numero disponivel.");
            return null;
        }

        // SO PERGUNTA A COR SE A OPCAO FOR VALIDA
        System.out.print("Cor das penas: ");
        String corPenas = sc.nextLine();

        return switch (opcao) {
            case 1 -> new Pato(nome, idade, corPenas);
            case 2 -> new Pinguim(nome, idade, corPenas);
            case 3 -> new Ema(nome, idade, corPenas);
            case 4 -> new Harpia(nome, idade, corPenas);
            default -> null;
        };
    }

    private static Animal cadastrarPeixe(Scanner sc, String nome, int idade) {
        System.out.println("\nPeixes disponiveis:");
        System.out.println("1 - Peixe-Morcego | 2 - Traira | 3 - Pirarucu | 4 - Tucunare");
        System.out.print("Escolha: ");

        int opcao;
        try {
            opcao = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um numero valido!");
            sc.nextLine();
            return null;
        }

        return switch (opcao) {
            case 1 -> new PeixeMorcego(nome, idade);
            case 2 -> new Traira(nome, idade);
            case 3 -> new Pirarucu(nome, idade);
            case 4 -> new Tucunare(nome, idade);
            default -> {
                System.out.println("Opcao invalida!");
                yield null;
            }
        };
    }

    private static Animal cadastrarReptil(Scanner sc, String nome, int idade) {
        System.out.println("\nRepteis disponiveis:");
        System.out.println("1 - Jabuti | 2 - Jacare-Acu | 3 - Sucuri | 4 - Teiu");
        System.out.print("Escolha: ");

        int opcao;
        try {
            opcao = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um numero valido!");
            sc.nextLine();
            return null;
        }

        return switch (opcao) {
            case 1 -> new Jabuti(nome, idade);
            case 2 -> new JacareAcu(nome, idade);
            case 3 -> new Sucuri(nome, idade);
            case 4 -> new Teiu(nome, idade);
            default -> {
                System.out.println("Opcao invalida!");
                yield null;
            }
        };
    }

    private static void listarTodos() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        TODOS OS ANIMAIS");
        System.out.println("=".repeat(50));

        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado!");
            return;
        }

        for (int i = 0; i < animais.size(); i++) {
            Animal animal = animais.get(i);
            System.out.println("\nAnimal #" + (i+1));
            System.out.println(animal.toString());
            animal.emitirSom();
            animal.comer();
            System.out.println("-".repeat(40));
        }
    }

    private static void listarCorredores() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        ANIMAIS CORREDORES");
        System.out.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                encontrou = true;
                System.out.println("\n" + animal);
                ((Corredor) animal).correr();
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal corredor encontrado!");
        }
    }

    private static void listarNadadores() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        ANIMAIS NADADORES");
        System.out.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Nadador) {
                encontrou = true;
                System.out.println("\n" + animal);
                ((Nadador) animal).nadar();
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal nadador encontrado!");
        }
    }

    private static void listarVoadores() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        ANIMAIS VOADORES");
        System.out.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Voador) {
                encontrou = true;
                System.out.println("\n" + animal);
                ((Voador) animal).voar();
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal voador encontrado!");
        }
    }

    private static void listarPredadores() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        ANIMAIS PREDADORES");
        System.out.println("=".repeat(50));

        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                encontrou = true;
                System.out.println("\n" + animal);
                ((Predador) animal).cacar();
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal predador encontrado!");
        }
    }

    private static void exibirTotal() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        ESTATISTICAS");
        System.out.println("=".repeat(50));
        System.out.println("Total de animais no sistema: " + Animal.getContador());
        System.out.println("Animais na lista atual: " + animais.size());
        System.out.println("=".repeat(50));
    }
}