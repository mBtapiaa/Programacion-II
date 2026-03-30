class Fraccion:

    def __init__(self ,a,b):
        self.__numerador = a
        self.__denominador = b

    def __add__(self , o):
        a = self.__numerador * o.__denominador + self.__denominador * o.__numerador
        b = self.__denominador * o.__denominador
        return Fraccion(a,b)

    def __sub__(self , o):
        c = Fraccion (0,1)
        c.__numerador = self.__numerador * o.__denominador - self.__denominador * o.__numerador
        c.__denominador = self.__denominador * o.__denominador
        return c

    def __mul__(self,o):
        return Fraccion(self.__numerador*o.__numerador,self.__denominador*o.__denominador)

    def __truediv__(self,o):
        return Fraccion(self.__numerador*o.__denominador,self.__denominador*o.__numerador)

    def __eq__(self,o):
        return self.__numerador==o.__numerador and self.__denominador==o.__denominador

    def convertirADecimal(self):
        if self.__denominador==0:
            return 0
        return self.__numerador/self.__denominador

    def esInverso(self,o):
        r = self * o
        return r.__numerador == r.__denominador

    def parseFraccion(self,str):
        p = str.split("/")
        return Fraccion(int(p[0]),int(p[1]))

    def simplifica(self):
        a = abs(self.__numerador)
        b = abs(self.__denominador)
        while b!=0:
            t=b
            b=a%b
            a=t
        return Fraccion(self.__numerador//a,self.__denominador//a)

    def __str__(self):
        return "{}/{}".format(self.__numerador ,self.__denominador)
