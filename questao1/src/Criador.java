public abstract class Criador {

    public abstract Produto fabrica();


    public void emitir(){
        Produto apolice = fabrica();
        apolice.calcular_premio();

        System.out.println(apolice.imprimir_resumo());
    }
    
}