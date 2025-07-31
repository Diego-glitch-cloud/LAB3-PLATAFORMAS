/*
DIEGO ANDRE CALDERÓN SALAZAR - 241263
LABORATORIO 3 KOTLIN
PROGRAMACIÓN DE PLATAFORMAS MÓVILES
link repositorio: https://github.com/Diego-glitch-cloud/LAB3-PLATAFORMAS.git
link video: https://youtu.be/KzvCz5u1cUs?si=-pA1fwXGYqSOcBAY
*/


fun main() {
    val hamburguesa = Burguer("King", 35.00)
    val pizza = Pizza("Margarita", 50.00)
    val helado = IceCream("Chocolate", 15.00)
    val jugo = Juice("Banano y fresa ", 16.00)

    println("---------------- AXIS PAWAS MENU -------------------\n")

    println("Hamburguesa: ${hamburguesa.name} | Precio: ${hamburguesa.price}")
    println("Como cocinar: ${hamburguesa.cook()}\n")

    println("Pizza: ${pizza.name} | Precio: ${pizza.price}")
    println("Como cocinar: ${pizza.cook()}\n")

    println("Helado: ${helado.name} | Precio: ${helado.price}")
    println("Como preparar: ${helado.cook()}\n")

    println("Jugo: ${jugo.name} | Precio: ${jugo.price}")
    println("Como hacer: ${jugo.cook()}\n")

    println("----------------------------------------------\n")

    println("¿Cómo debería comer mi heladito? ---> ${helado.eat()}\n")

    println("----------------------------------------------\n")

    val descuento = 63.00
    println("LA HAMBURGUESA ${hamburguesa.name} TIENE ${descuento}% DE DESCUENTO!")
    println("Precio antes: ${hamburguesa.price} | Precio ahora: ${hamburguesa.discountedPrice(descuento)}")

}