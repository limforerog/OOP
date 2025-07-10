class Vista:
    def mostrar_menu(self):
        print("\nCalculadora")
        print("1) Sumar")
        print("2) Restar")
        print("3) Multiplicar")
        print("4) Dividir")
        print("5) Salir")

    def pedir_opcion(self):
        return input("Elige una opción: ")

    def pedir_numero(self, mensaje):
        return float(input(mensaje))

    def mostrar_resultado(self, resultado):
        print("Resultado:", resultado)
