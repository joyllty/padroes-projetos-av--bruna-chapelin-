public class Vida extends Produto{

    private double capital_segurado;

    public Vida(double capital_segurado){
        this.capital_segurado = capital_segurado;
    }

    public void calcular_premio(){
        premio_mensal = capital_segurado * 0.3;
    }

    public String listarDocumentos(){
        return "documento de identidade e CPF";
    }
}