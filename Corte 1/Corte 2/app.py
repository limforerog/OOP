from calculadora import Calculadora
from vista import Vista

class App:
    def __init__(self):
        self.calc = Calculadora()
        self.vista = Vista()

    def ejecutar(self):
        while True:
            self.vista.mostrar_menu()
            opcion = self.vista.pedir_opcion()

            if opcion == "5":
                print("Hasta luego.")
                break

            n1 = self.vista.pedir_numero("Ingresa el primer número: ")
            n2 = self.vista.pedir_numero("Ingresa el segundo número: ")

            if opcion == "1":
                res = self.calc.suma(n1, n2)
            elif opcion == "2":
                res = self.calc.resta(n1, n2)
            elif opcion == "3":
                res = self.calc.multiplicacion(n1, n2)
            elif opcion == "4":
                res = self.calc.division(n1, n2)
            else:
                print("Opción inválida.")
                continue

            self.vista.mostrar_resultado(res)


if __name__ == "__main__":
    app = App()
    app.ejecutar()

