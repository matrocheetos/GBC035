public class VHS extends Video {
    
    private boolean rebobinada;

    public VHS(String nome, String genero, int tipo, int ano, int nroDeCopias, double preco,
                String atores, String diretor, int duracao, int classificacaoEtaria,
                boolean rebobinada) {

        super(nome,genero,tipo,ano,nroDeCopias,preco,atores,diretor,duracao,classificacaoEtaria);
        this.rebobinada = rebobinada;
    }
}