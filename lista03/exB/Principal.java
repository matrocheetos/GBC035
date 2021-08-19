import java.util.Scanner;

public class Principal {
    
    public static void main(String z[]) {

        Audio a[] = new Audio[5];
        Video v[] = new Video[5];
        VHS vhs[] = new VHS[5];
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1) Adicionar midia");
            System.out.println("2) Sair");
            System.out.print("OPCAO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    sc.nextLine(); //limpa buffer
                    String nome = sc.nextLine();
                    System.out.print("Genero: ");
                    String genero = sc.nextLine();
                    System.out.print("Tipo [(1)audio, (2)video]: ");
                    int tipo = sc.nextInt();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    System.out.print("Numero de copias: ");
                    int nroDeCopias = sc.nextInt();
                    System.out.print("Preco de locacao: ");
                    double preco = sc.nextDouble();
                    
                    if(tipo==1) { //audio
                        System.out.print("Cantor: ");
                        sc.nextLine(); //limpa buffer
                        String cantor = sc.nextLine();
                        System.out.print("Numero de faixas: ");
                        int nroDeFaixas = sc.nextInt();

                        Audio x = new Audio(nome,genero,tipo,ano,nroDeCopias,preco,cantor,nroDeFaixas);
                        a[Audio.getCt()] = x;
                    } else if(tipo==2) { //video
                        System.out.print("Nomes dos atores: ");
                        sc.nextLine(); //limpa buffer
                        String atores = sc.nextLine();
                        System.out.print("Diretor: ");
                        String diretor = sc.nextLine();
                        System.out.print("Duracao (em minutos): ");
                        int duracao = sc.nextInt();
                        System.out.print("Classificacao etaria: ");
                        int classificacaoEtaria = sc.nextInt();

                        System.out.print("Eh VHS? ");
                        if(sc.nextBoolean()) {
                            System.out.print("Esta rebobinada? ");
                            boolean rebobinada = sc.nextBoolean();
                            
                            VHS x = new VHS(nome,genero,tipo,ano,nroDeCopias,preco,atores,diretor,duracao,classificacaoEtaria,rebobinada);
                            vhs[VHS.getCt()] = x;
                        } else {
                            Video x = new Video(nome,genero,tipo,ano,nroDeCopias,preco,atores,diretor,duracao,classificacaoEtaria);
                            v[Video.getCt()] = x;
                        }
                    }
                    break;
            }
        } while (op!=2);
    }
}
