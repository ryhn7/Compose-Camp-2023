class Cookie(val name: String, val softBaked: Boolean, val hasFilling: Boolean, val price: Double)

val cookies =
        listOf(
                Cookie(
                        name = "Chocolate Chip",
                        softBaked = false,
                        hasFilling = false,
                        price = 1.69
                ),
                Cookie(name = "Banana Walnut", softBaked = true, hasFilling = false, price = 1.49),
                Cookie(name = "Vanilla Creme", softBaked = false, hasFilling = true, price = 1.59),
                Cookie(
                        name = "Chocolate Peanut Butter",
                        softBaked = false,
                        hasFilling = true,
                        price = 1.49
                ),
                Cookie(name = "Snickerdoodle", softBaked = true, hasFilling = false, price = 1.39),
                Cookie(name = "Blueberry Tart", softBaked = true, hasFilling = true, price = 1.79),
                Cookie(
                        name = "Sugar and Sprinkles",
                        softBaked = false,
                        hasFilling = false,
                        price = 1.39
                )
        )

val fullMenu = cookies.map { "${it.name} - ${it.price}" }
// val softBakedMenu = cookies.filter { it.softBaked }
// val hasFillingMenu = cookies.filter { it.hasFilling }

val groupedMenu = cookies.groupBy { it.softBaked }

val softBakedMenu = groupedMenu[true] ?: listOf()
val crunchyMenu = groupedMenu[false] ?: listOf()

val colors = listOf("Red", "Green", "Blue")

fun main() {
    // println("Full Menu:")
    // fullMenu.forEach { println(it) }
    // println("Soft Cookies:")
    // softBakedMenu.forEach { println("${it.name} - $${it.price}") }
    // println()
    // println("Crunchy Cookies:")
    // crunchyMenu.forEach { println("${it.name} - $${it.price}") }
    // println()
    // println("Filled Cookies:")
    // hasFillingMenu.forEach { println("${it.name} - $${it.price}") }

    println(colors[2])
    println(colors.get(2))
}
