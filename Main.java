package main;

import implementar.supermarket;
import implementar.supermarketArray;
import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        supermarket supermarketlista = new supermarketArray(SIZE);

        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item que deseja inserir: ");
                    String item = scanner.next();
                    supermarketlista.add(item);
                    break;
                case 2:
                    supermarketlista.print();
                    break;
                case 3:
                    System.out.println("Digite qual item você deseja remover: ");
                    int index = scanner.nextInt();
                    supermarketlista.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do Programa");
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        } while(opcao != 4);
        scanner.close();
    }
}