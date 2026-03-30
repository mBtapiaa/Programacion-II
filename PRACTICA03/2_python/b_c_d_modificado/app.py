from clases import *

elementos = [
    Calamar("cali"),
    Delfin("flipper"),
    Mamifero("mami"),
    CriaturaMarina("criatura"),
    Ballena("balli")
]

for i in range(len(elementos)):
    print(elementos[i])
    elementos[i].metodo1()
    elementos[i].metodo2()
    print()
