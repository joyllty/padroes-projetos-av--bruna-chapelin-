public class Residencial extends Produto{

    private double valor_imovel;

    public Residencial(double valor_imovel){
        this.valor_imovel = valor_imovel;
    }

    public void calcular_premio(){
        premio_mensal = (valor_imovel * 0.015) / 12;
    }

    public String listarDocumentos(){
        return "escritura ou contrato de locação";
    }

}
