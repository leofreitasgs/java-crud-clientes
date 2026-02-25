package main;

import model.Cliente;
import service.ClienteService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ClienteService service = new ClienteService();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Remover cliente");
            System.out.println("4 - Atualizar cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    service.adicionarCliente(new Cliente(nome, idade));
                    break;

                case 2:
                    service.listarClientes();
                    break;

                case 3:
                    System.out.print("Informe o índice do cliente: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    service.removerCliente(indice);
                    break;

                case 4:
                    System.out.print("Informe o índice do cliente: ");
                    int indiceAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Nova idade: ");
                    int novaIdade = scanner.nextInt();
                    scanner.nextLine();

                    service.atualizarCliente(indiceAtualizar, novoNome, novaIdade);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}