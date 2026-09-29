package questao2.src;

public class Main {

    absFabrica fabrica1 = new FabricaBrasil();

        Checkout checkout1 = new Checkout(fabrica1);

        checkout1.finalizarPedido();

        absFabrica fabrica2 = new FabricaAlemanha();

        Checkout checkout2 = new Checkout(fabrica2);

        checkout2.finalizarPedido()
}
