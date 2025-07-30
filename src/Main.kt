/*
DIEGO ANDRE CALDERÓN SALAZAR - 241263
LABORATORIO 3 KOTLIN
PROGRAMACIÓN DE PLATAFORMAS MÓVILES
link repositorio: https://github.com/Diego-glitch-cloud/LAB3-PLATAFORMAS.git
*/


fun main() {
    val hamburguesa = Burguer("King", 35.00)
    val pizza = Pizza("Margarita", 50.00)
    val helado = IceCream("Chocolate", 15.00)
    val jugo = Juice("Banano y fresa ", 16.00)

    println("Impresión de las comidas ----> \n")

    println("Hamburguesa: ${hamburguesa.name} | Precio: ${hamburguesa.price}")
    println("Pizza: ${pizza.name} | Precio: ${pizza.price}")
    println("Helado: ${helado.name} | Precio: ${helado.price}")
    println("Jugo: ${jugo.name} | Precio: ${jugo.price}\n")

    println("----------------------------------------------\n")

    println("¿Cómo debería comer mi heladito? ---> ${helado.eat()}")
}