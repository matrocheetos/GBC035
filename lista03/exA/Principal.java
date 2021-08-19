import java.util.Scanner;

public class Principal {
    
    public static void main(String z[]) {
        
        Vendedor v[] = new Vendedor[5];
        Administrador a[] = new Administrador[5];
        Scanner sc = new Scanner(System.in);
        int op = 0, funcionario = 0, tf = 0;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1) Adicionar funcionario");
            System.out.println("2) Exibir dados do funcionario");
            System.out.println("3) Adicionar vendas / horas extras");
            System.out.println("4) Calcular salario");
            System.out.println("5) Sair");
            System.out.print("OPCAO: ");
            op = sc.nextInt();

            //interface para selecao de funcionario (opcoes 2, 3 e 4)
            if(op>1 && op<5) {
                System.out.print("Funcionario: (1)Vendedor ou (2)Administrador? ");
                tf = sc.nextInt();
                if(tf==1) {
                    for(int i=0;i<Vendedor.getCt();i++){
                        System.out.print((i+1)+") "+v[i].getNome());
                    }
                    System.out.print("Selecao: ");
                    funcionario = sc.nextInt()-1;
                } else if(tf==2) {
                    for(int i=0;i<Administrador.getCt();i++){
                        System.out.print((i+1)+") "+a[i].getNome());
                    }
                    System.out.print("Opcao: ");
                    funcionario = sc.nextInt()-1;
                } else
                    System.out.println("Opcao invalida");
            }

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    sc.nextLine(); //limpa buffer
                    String nome = sc.nextLine();
                    System.out.print("RG: ");
                    int rg = sc.nextInt();
                    System.out.print("Salario base: ");
                    double salario = sc.nextDouble();

                    System.out.print("Funcionario: (1)Vendedor ou (2)Administrador? ");
                    tf = sc.nextInt();
                    if(tf==1 && Vendedor.getCt()<5) {
                        Vendedor x = new Vendedor(nome,rg,salario);
                        v[Vendedor.getCt()] = x;
                        System.out.println("Vendedor adicionado");
                    } else if(tf==2 && Administrador.getCt()<5) {
                        Administrador x = new Administrador(nome,rg,salario);
                        a[Administrador.getCt()] = x;
                        System.out.println("Administrador adicionado");
                    } else
                        System.out.println("Opcao invalida");
                    break;
                case 2:
                    if(tf==1)
                        System.out.println(v[funcionario].getNome()+" - "+v[funcionario].getRG()+" - "+v[funcionario].getSalario());
                    else if(tf==2)
                        System.out.println(a[funcionario].getNome()+" - "+a[funcionario].getRG()+" - "+a[funcionario].getSalario());
                    break;
                case 3:
                    if(tf==1) {
                        System.out.print("Valor total das vendas: ");
                        double vendas = sc.nextDouble();
                        v[funcionario].addVendas(vendas);
                    } else if(tf==2) {
                        System.out.print("Horas extra acumuladas: ");
                        int horas = sc.nextInt();
                        a[funcionario].addHoras(horas);
                    }
                    break;
                case 4:
                    if(tf==1)
                        System.out.println("Salario: "+v[funcionario].salarioTotal());
                    else if(tf==2)
                        System.out.println("Salario: "+a[funcionario].salarioTotal());
                    break;
            }
        } while (op!=5);
    }
}
