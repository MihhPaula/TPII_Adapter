// Interface do Cliente
class ITarget{
    request(){

    }
}

// Cliente
class Cliente{
    constructor(target){
        this.target = target;
    }
    makeRequest(){
        console.log("Fazendo Uma Requisição")
        this.target.request();
    }
}

// Serviço Existente  (Adaptee)
class Adaptee{
    specificRequest(){
        console.log("Requisição especifica do Adaptee");
    }
}

// Adaptador (Adapter)
class Adapter{
    constructor(adaptee){
        this.adaptee = adaptee;
    }
    request(){
        this.adaptee.specificRequest();
    }
}


// Utilizando o Adaptador  #####################
const adaptee = new Adaptee();
const adapter = new Adapter(adaptee);
const cliente = new Cliente(adapter)

cliente.makeRequest();