public class Automovel extends Produto{

    private double valor_veiculo;

    public Automovel(double valor_veiculo){
        this.valor_veiculo = valor_veiculo;
    }

    public void calcular_premio(){
        premio_mensal = (valor_veiculo * 0.08) / 12;

    }

    public String listarDocumentos(){
        return "CNH e CRLV";
    }

}