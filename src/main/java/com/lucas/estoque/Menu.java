
package com.lucas.estoque;

import java.util.Scanner;


public class Menu {
    public Scanner sc = new Scanner(System.in);
    public Estoque estoque = new Estoque();
    int opcao;
    
    public void selecionarMenu() {
        do{ 
            System.out.println("---------- MENU ----------");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar estoque");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            
            switch(opcao) {
                
                case 0:
                    System.out.println("Saindo...");
                break;
                
                case 1:
                    Produto item = new Produto();
                    System.out.println("**** ADICIONAR ITEM ****");
                    System.out.print("ID do produto: ");
                    item.id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Nome do produto: ");
                    item.nome = sc.nextLine();
                    
                    System.out.print("Quantidade do produto: ");
                    item.quantidade = sc.nextInt();
                    
                    estoque.adicionarProduto(item);
                break;
                
                case 2:
                    int id;
                    System.out.println("**** REMOVER ITEM ****");
                    System.out.print("ID do produto: ");
                    id = sc.nextInt();
                    estoque.removerProduto(id);
                break;
                
                case 3:
                    estoque.listarEstoque();
                break;
                
                default :
                    System.out.println("Selecione uma opcao valida");
                break;
            }
            
            limparConsole();
        }while(opcao != 0);
    }
    
    public void limparConsole() {
        // Imprime 15 linhas em branco
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }
}
