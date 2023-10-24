enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
        val title: String,
        val description: String? = null,
        val daypart: Daypart,
        val duration: Int
)

fun main() {
    val event1 =
            Event(
                    title = "Study Kotlin",
                    description = "Commit to studying Kotlin at least 15 minutes per day",
                    Daypart.MORNING,
                    duration = 15
            )

    event1.let { 
        println(it.title) 
        println(it.description)
        println(it.daypart)
        println(it.duration)
    }
}
