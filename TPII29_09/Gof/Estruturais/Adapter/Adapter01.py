# Interface do Cliente
class ITarget:
    def request(self):
        pass

# Cliente
class Cliente:
    def __init__(self, target):
        self.target = target

    def make_request(self):
        print("Fazendo Uma Requisição")
        self.target.request()

# Serviço Existente (Adaptee)
class Adaptee:
    def specific_request(self):
        print("Requisição específica do Adaptee")

# Adaptador (Adapter)
class Adapter(ITarget):
    def __init__(self, adaptee):
        self.adaptee = adaptee

    def request(self):
        self.adaptee.specific_request()

# Utilizando o Adaptador
adaptee = Adaptee()
adapter = Adapter(adaptee)
cliente = Cliente(adapter)

cliente.make_request()
