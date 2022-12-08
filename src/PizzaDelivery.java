public class PizzaDelivery {

    int numPedidos;

    public int quantiEntregadores(){
        return (numPedidos > 5) ? 2 : 1;
    }
}
