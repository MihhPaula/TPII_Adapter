// Interface do Cliente
interface ITarget {
    void request();
}

// Cliente
class Cliente {
    private ITarget target;

    public Cliente(ITarget target) {
        this.target = target;
    }

    public void makeRequest() {
        System.out.println("Fazendo Uma Requisição");
        target.request();
    }
}

// Serviço Existente (Adaptee)
class Adaptee {
    public void specificRequest() {
        System.out.println("Requisição específica do Adaptee");
    }
}

// Adaptador (Adapter)
class Adapter implements ITarget {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}

// Classe Main para execução
public class Adapter01 {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        Cliente cliente = new Cliente(adapter);

        cliente.makeRequest();
    }
}
