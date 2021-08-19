public class Funcionario {
    
    private String nome;
    private int rg;
    private double salario;
    private static int ct = 0;

    public Funcionario(String nome, int rg, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
        ct++;
    }

    public String getNome() {
        return nome;
    }

    public int getRG() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    public static int getCt() {
        return ct;
    }
}