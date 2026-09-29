
public class CriadorResidencial extends Criador{

    private double valor_imovel;


    public CriadorResidencial(double valor_imovel){
        this.valor_imovel = valor_imovel;
    }

    @Override 
    public Produto fabrica(){
        return new Residencial(valor_imovel);
    }
}
