package NivelBasico.Desafios;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        String[] nomes = new String[10];
        int count = 0;

        String opcao = "";

        while (!opcao.equals("3")) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = opc.nextLine();

            switch (opcao) {
                case "1":
                    if (count < nomes.length) {
                        System.out.print("Digite o nome do ninja: ");
                        nomes[count] = opc.nextLine();
                        count++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Não  é possível cadastrar mais ninjas, limite atingido!");
                    }
                    break;

                case "2":
                    System.out.println("\n===== Lista de Ninjas =====");
                    if (count == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + nomes[i]);
                        }
                    }
                    break;

                case "3":
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        opc.close();
    }
}
