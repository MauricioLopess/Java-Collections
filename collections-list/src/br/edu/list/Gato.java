package br.edu.list;
public class Gato implements Comparable<Gato> {
    private String nome;
    private String cor;
    private Integer idade;
    
    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "[nome: " + nome + ", cor: " + cor + ", idade: " + idade + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        int nome = this.getNome().compareToIgnoreCase(gato.getNome());
        return nome;
    }

    

    

    
}
