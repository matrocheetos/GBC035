public class Vendedor extends Funcionario {
    
    private double comissao = 0.05;
    private double totalDeVendas;

    public Vendedor(String nome, int rg, double salario) {
        super(nome, rg, salario);
    }

    public void addVendas(double vendas) {
        this.totalDeVendas = this.totalDeVendas + vendas;
    }

    public double salarioTotal(){
        double total = getSalario() + (totalDeVendas*comissao);
        this.totalDeVendas = 0;
        return total;
    }
}