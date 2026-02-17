
package com.lucas.estoque;

public class Produto {
    
    public int id;
    public String nome;
    public int quantidade;
    
    @Override
    public String toString() {
        return "ID: " + id +
               " | Nome: " + nome +
               " | Quantidade: " + quantidade;
    }
}
