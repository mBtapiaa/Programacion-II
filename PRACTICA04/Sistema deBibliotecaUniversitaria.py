class Pagina:
    def __init__(self, numero_pagina, contenido_pagina):
        self.numero_pagina = numero_pagina
        self.contenido_pagina = contenido_pagina

    def mostrar_pagina(self):
        print(f"Pagina {self.numero_pagina}: {self.contenido_pagina}")


class Libro:
    def __init__(self, titulo, isbn, contenido_paginas):
        self.titulo = titulo
        self.isbn = isbn

        # COMPOSICION
        self.paginas = []

        for i in range(len(contenido_paginas)):
            pagina = Pagina(i + 1, contenido_paginas[i])
            self.paginas.append(pagina)

    def leer(self):
        print(f"\nLibro: {self.titulo}")

        for pagina in self.paginas:
            pagina.mostrar_pagina()


class Autor:
    def __init__(self, nombre, nacionalidad):
        self.nombre = nombre
        self.nacionalidad = nacionalidad

    def mostrar_info(self):
        print(f"Autor: {self.nombre} - {self.nacionalidad}")


class Estudiante:
    def __init__(self, codigo, nombre):
        self.codigo = codigo
        self.nombre = nombre

    def mostrar_info(self):
        print(f"Estudiante: {self.codigo} - {self.nombre}")


class Prestamo:
    def __init__(self, fecha_prestamo, fecha_devolucion, estudiante, libro):
        self.fecha_prestamo = fecha_prestamo
        self.fecha_devolucion = fecha_devolucion

        # ASOCIACION
        self.estudiante = estudiante
        self.libro = libro

    def mostrar_info(self):
        print("\nPrestamo")
        print(f"Fecha prestamo: {self.fecha_prestamo}")
        print(f"Fecha devolucion: {self.fecha_devolucion}")
        print(f"Estudiante: {self.estudiante.nombre}")
        print(f"Libro: {self.libro.titulo}")


class Horario:
    def __init__(self, dias_apertura, hora_apertura, hora_cierre):
        self.dias_apertura = dias_apertura
        self.hora_apertura = hora_apertura
        self.hora_cierre = hora_cierre

    def mostrar_horario(self):
        print("\nHorario")
        print(f"Dias: {self.dias_apertura}")
        print(f"Apertura: {self.hora_apertura}")
        print(f"Cierre: {self.hora_cierre}")


class Biblioteca:
    def __init__(self, nombre, dias, apertura, cierre):
        self.nombre = nombre

        # AGREGACION
        self.libros = []
        self.autores = []

        # COMPOSICION
        self.horario = Horario(dias, apertura, cierre)

        self.prestamos = []

    def agregar_libro(self, libro):
        self.libros.append(libro)

    def agregar_autor(self, autor):
        self.autores.append(autor)

    def prestar_libro(self, estudiante, libro):
        prestamo = Prestamo(
            "11/05/2026",
            "18/05/2026",
            estudiante,
            libro
        )

        self.prestamos.append(prestamo)

    def mostrar_estado(self):
        print("\n========== BIBLIOTECA ==========")
        print(f"Nombre: {self.nombre}")

        self.horario.mostrar_horario()

        print("\n========== LIBROS ==========")

        for libro in self.libros:
            print(f"Titulo: {libro.titulo}")
            print(f"ISBN: {libro.isbn}")

        print("\n========== AUTORES ==========")

        for autor in self.autores:
            autor.mostrar_info()

        print("\n========== PRESTAMOS ==========")

        for prestamo in self.prestamos:
            prestamo.mostrar_info()

    def cerrar_biblioteca(self):
        print("\nCerrando biblioteca...")
        self.prestamos.clear()
        print("Los prestamos dejaron de existir")


# =========================
# PROGRAMA PRINCIPAL
# =========================

# COMPOSICION Libro - Pagina
paginas_libro1 = [
    "Introduccion a Python",
    "Variables y operadores",
    "Condicionales y ciclos"
]

paginas_libro2 = [
    "Modelo relacional",
    "Consultas SQL",
    "Llaves primarias y foraneas"
]

libro1 = Libro(
    "Programacion Python",
    "ISBN-111",
    paginas_libro1
)

libro2 = Libro(
    "Base de Datos",
    "ISBN-222",
    paginas_libro2
)

# AGREGACION Biblioteca - Autor
autor1 = Autor(
    "Carlos Perez",
    "Boliviano"
)

autor2 = Autor(
    "Ana Lopez",
    "Peruana"
)

# ESTUDIANTES
estudiante1 = Estudiante(
    "2025001",
    "Maria"
)

estudiante2 = Estudiante(
    "2025002",
    "Juan"
)

# COMPOSICION Biblioteca - Horario
biblioteca = Biblioteca(
    "Biblioteca UMSA",
    "Lunes a Viernes",
    "08:00",
    "20:00"
)

# AGREGACION Biblioteca - Libro
biblioteca.agregar_libro(libro1)
biblioteca.agregar_libro(libro2)

# AGREGACION Biblioteca - Autor
biblioteca.agregar_autor(autor1)
biblioteca.agregar_autor(autor2)

# ASOCIACION Prestamo - Estudiante - Libro
biblioteca.prestar_libro(estudiante1, libro1)
biblioteca.prestar_libro(estudiante2, libro2)

# MOSTRAR ESTADO
biblioteca.mostrar_estado()

# LEER LIBRO
libro1.leer()

# CERRAR BIBLIOTECA
biblioteca.cerrar_biblioteca()
