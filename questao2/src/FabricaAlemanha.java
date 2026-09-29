package questao2.src;

public class FabricaAlemanha implements absFabrica{

    @Override
    public Documento criarDocumento(){
        return new VATInvoice(double imposto);
    }

    @Override
    public EtiquetaEnvio criarEtiqueta(){
        return new EtiquetaAlemanha(String transportadora);
    }

    @Override
    public ProcessamentoPag criarProcessamento(){
        return new ProcessamentoAlemanha(String meio_pagamento);
    }
}
}
