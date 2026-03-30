from clases import *

elementos = [
    Calamar("cali"),
    Delfin("flipper"),
    Mamifero("mami"),
    CriaturaMarina("criatura")
]

for i in range(0, len(elementos), 1):
    elementos[i].metodo2()
    print(elementos[i])
    elementos[i].metodo1()
    print()
