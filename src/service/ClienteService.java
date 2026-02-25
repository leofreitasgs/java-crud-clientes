package service;

import model.Cliente;

import java.util.ArrayList;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso.");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(i + " - " + clientes.get(i));
            }
        }
    }

    public void removerCliente(int indice) {
        if (indice >= 0 && indice < clientes.size()) {
            clientes.remove(indice);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void atualizarCliente(int indice, String novoNome, int novaIdade) {
        if (indice >= 0 && indice < clientes.size()) {
            Cliente cliente = clientes.get(indice);
            cliente.setNome(novoNome);
            cliente.setIdade(novaIdade);
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }


}
