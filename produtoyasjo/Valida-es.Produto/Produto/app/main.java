package app;

import java.util.Scanner;

import model.Produto;
import util.Validacoes

public class main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto("Teste", 20, 10);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(produto.toString());
                    break;
                case 2:
                    alterarNome(produto, scanner);
                    break;
                case 3:
                    alterarPreco(produto, scanner);
                    break;
                case 4:
                    alterarQuantidade(produto, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados do produto");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar preço");
        System.out.println("4. Alterar quantidade");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Produto produto, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            produto.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarPreco(Produto produto, Scanner scanner) {
        System.out.print("Digite o novo preco: ");
        try {
            int novoPreco = Integer.parseInt(scanner.nextLine());
            if (Validacoes.precoValida(novoPreco)) {
                produto.setPreco(novoPreco);
                System.out.println("Preço alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroPreco(novoPreco));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }

    public static void alterarQuantidade(Produto produto, Scanner scanner) {
        System.out.print("Digite a nova quantidade de produtos: ");
        try {
            double novaQuantidade = Double.parseDouble(scanner.nextLine());
            if (Validacoes.quantidadeValida(novaQuantidade)) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroQuantidade(novaQuantidade));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido para a quantidade!");
        }
    }

}
    }
}
