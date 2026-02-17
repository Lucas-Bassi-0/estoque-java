package com.lucas.estoque;

public class Estoque {
    public Produto[] produtos = new Produto[3];
    
    public void adicionarProduto(Produto item) {
        for(int i = 0; i < produtos.length; i++){
           if(produtos[i] == null){
               produtos[i] = item;
               System.out.println("Produto adicionado!!!");
               return; 
           }
        }
        System.out.print("Estoque cheio!!!");
    }
    
    public void removerProduto(int id) {
        for(int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null && produtos[i].id == id) {
                produtos[i] = null;
                System.out.println("Produto removido!!!");
                return;
            }
        }
        System.out.println("Produto nao encontrado!!!");
    }
    
    public void listarEstoque() {
        int contador = 0;
        System.out.println("------ ESTOQUE ------");
        
        for(int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null) {
                System.out.println(produtos[i]);
                contador++;
            }
        }
        if(contador == 0) {
            System.out.println("Nenhum item no estoque!!!");
        }
    }
}
