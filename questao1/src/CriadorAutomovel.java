
public class CriadorAutomovel extends Criador{
    
    private double valor_veiculo;

    public CriadorAutomovel(double valor_veiculo){
        this.valor_veiculo = valor_veiculo;
    }

    @Override 
    public Produto fabrica(){
        return new Automovel(valor_veiculo);
    }
}
