package Banco;

public class Banco {
    private int codigo;
    private String nome;
    private int numeroAgencias;

    public Banco(int codigo, String nome, int numeroAgencias) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroAgencias = numeroAgencias;
    }

    @Override
    public String toString() {
        return "Banco [codigo = " + codigo + ", nome = " + nome + ", numeroAgencias = " + numeroAgencias + "]";
    }
}