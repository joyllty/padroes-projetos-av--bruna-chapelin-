public abstract class Produto {

    protected double premio_mensal;
    protected String documentos;

    public abstract void calcular_premio();
    public abstract String listarDocumentos();

    public String imprimir_resumo(){
        return "\n>> Prêmio mensal: R$ " + premio_mensal +
                "\n>> Documentos exigidos: " + listarDocumentos();
    }


}
