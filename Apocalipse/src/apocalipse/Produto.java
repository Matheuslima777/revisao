/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apocalipse;

/**
 *
 * @author Aluno
 */
public class Produto  {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preço) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preço) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return 
                "\n NOME: " + nome +
                "\n CATEGORIA" + categoria + 
                "\n PRECO" + preco ;
    }

   
    
    
}
