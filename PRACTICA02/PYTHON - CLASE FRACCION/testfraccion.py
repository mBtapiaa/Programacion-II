from fraccion import Fraccion

f1 = Fraccion (1,4)
f2 = Fraccion (4,3)

print("f1 =", f1)
print("f2 =", f2)

print("suma =", f1 + f2)
print("resta =", f1 - f2)
print("multiplica =", f1 * f2)
print("divide =", f1 / f2)
print("decimal =", f1.convertirADecimal())
print("inverso =", f1.esInverso(f2))

f3 = f1.parseFraccion("-2/3")
print("parse =", f3)

print("simplificada =", Fraccion(2,8).simplifica())
