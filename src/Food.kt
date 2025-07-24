abstract class Food (val name: String, val price: Float) {
    abstract fun cook(): String
}

class Burguer (name: String, price: Float): Food(name, price) {
    override fun cook():String {
        return "Asando la jugosa hamburguesa a la perfección en la parrilla caliente, " +
                "hasta que esté dorada por fuera y tierna por dentro."
    }
}

class Pizza (name: String, price: Float): Food(name, price) {
    override fun cook():String {
        return "Horneando la deliciosa pizza en el horno de piedra, " +
                "hasta que el queso burbujee y la masa esté crujiente y dorada."
    }
}

class IceCream (name: String, price: Float): Food(name, price), Dessert {
    override fun cook(): String {
        return "Congelando el helado hasta que esté listo para servir y disfrutar."
    }

    override fun eat(): String {
        return "Coma el helado frío, con una servilleta acompañándolo. Puede acompañarlo de más chocolate si gusta."
    }
}