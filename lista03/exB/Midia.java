public class Midia {
    
    private String nome, genero;
    private int tipo; // (1)audio (2)video
    private int ano, nroDeCopias;
    private double preco;
    private static int ct = 0;

    public Midia(String nome, String genero, int tipo, int ano, int nroDeCopias, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
        this.ano = ano;
        this.nroDeCopias = nroDeCopias;
        this.preco = preco;
        ct++;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTipo() {
        return tipo;
    }

    public int getAno() {
        return ano;
    }

    public int getNroDeCopias() {
        return nroDeCopias;
    }

    public double getPreco() {
        return preco;
    }

    public static int getCt() {
        return ct;
    }
}
