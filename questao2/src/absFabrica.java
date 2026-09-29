package questao2.src;

public interface absFabrica {
    
    Documento criarDocumento();
    EtiquetaEnvio criarEtiqueta();
    ProcessamentoPag criarProcessamento();
    
}
