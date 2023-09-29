// Classe Cliente
class Cliente{
    constructor(){
        this.adapter = new Adapter();
    }

    request(){
        console.log("Fazendo uma Requisição");
        this.adapter.specificRequest();
    }
}

// Classe Serviço Existente
class Adaptee{
    specificRequest(){
        console.log("Requisição Especifica do Adaptee")
    }
}

// Classe Adaptador
class Adapter extends Adaptee{
    specificRequest(){
        console.log("Adaptação do Serviço Existente Para o Cliente");
    }
}


// Utilização ###################
const cliente = new Cliente();
cliente.request();