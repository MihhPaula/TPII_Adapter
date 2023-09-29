class Cliente {
    private Adapter adapter;

    public Cliente(){
        this.adapter = new Adapter();
    }

    public void request(){
        System.out.println("Fazendo uma Requisição");
        this.adapter.specificRequest();
    }
}

// Classe Serviço Existente
class Adaptee{
    public void specificRequest(){
        System.out.println("Requisição Especifica do Adaptee");
    }
}

// Classe Adaptador
class Adapter extends Adaptee{
    @Override
    public void specificRequest(){
        System.out.println("Adaptação do Serviço Existente Para o Cliente");
    }

}

// UTILIZAÇÃO #####################
public class Adapter02{
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.request();
    }
}

