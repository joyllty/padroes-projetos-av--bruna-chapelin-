

public class CriadorVida extends Criador{

    private double capital_segurado;

    public CriadorVida(double capital_segurado){
        this.capital_segurado = capital_segurado;
    }

    @Override 
    public Produto fabrica(){
        return new Vida(capital_segurado);
    }
}
