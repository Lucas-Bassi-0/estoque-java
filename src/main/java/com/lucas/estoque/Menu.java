
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
                    limparTela();
                break;
                
                case 1:
                    Produto item = new Produto();
                    System.out.println("ID do produto: ");
                    item.id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Nome do produto: ");
                    item.nome = sc.nextLine();
                    
                    System.out.println("Quantidade do produto: ");
                    item.quantidade = sc.nextInt();
                    
                    estoque.adicionarProduto(item);
                    limparTela();
                break;
                
                case 2:
                    int id;
                    System.out.println("ID do produto: ");
                    id = sc.nextInt();
                    estoque.removerProduto(id);
                    limparTela();
                break;
                
                case 3:
                    estoque.listarEstoque();
                    limparTela();
                break;
                
                default :
                    System.out.println("Selecione uma opcao valida");
                    limparTela();
                break;
            }
        }while(opcao != 0);
    }
    
    public static void limparTela() {
       for(int i = 0; i < 40; i++){
           System.out.println();
       }
   }
    
}
