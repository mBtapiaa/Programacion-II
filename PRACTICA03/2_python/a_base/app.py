from clases import *

elementos = [
    Calamar(),
    Delfin(),
    Mamifero(),
    CriaturaMarina()
]

for i in range(len(elementos)):
    print(elementos[i])
    elementos[i].metodo1()
    elementos[i].metodo2()
    print()
