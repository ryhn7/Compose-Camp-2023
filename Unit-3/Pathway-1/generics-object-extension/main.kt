enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

data class Question<T>(val questionText: String, val answer: T, val difficulty: Difficulty)

class Quiz : ProgressPrintable {
    val question1 = Question<String>("What is the capital of the UK?", "London", Difficulty.EASY)
    val question2 = Question<Boolean>("Is the Earth flat?", false, Difficulty.HARD)
    val question3 = Question<Int>("What is 2 + 2?", 4, Difficulty.MEDIUM)

    object StudentProgress {
        var total: Int = 10
        var answered: Int = 8
    }

    override val progressText: String
        get() = "${Quiz.StudentProgress.answered} out of ${Quiz.StudentProgress.total} answered"

    override fun printProgressBar() {
        repeat(Quiz.StudentProgress.answered) { print("▓") }
        repeat(Quiz.StudentProgress.total - Quiz.StudentProgress.answered) { print("░") }
        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

// val Quiz.StudentProgress.progressText: String
//     get() = "$answered out of $total answered"

// fun Quiz.StudentProgress.printProgressBar() {
//     repeat(Quiz.StudentProgress.answered) { print("▓") }
//     repeat(Quiz.StudentProgress.total - Quiz.StudentProgress.answered) { print("░") }
//     println()
//     println(Quiz.StudentProgress.progressText)
// }

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

fun main() {
    // println("${Quiz.StudentProgress.answered} out of ${Quiz.StudentProgress.total} answered")
    // Quiz.StudentProgress.printProgressBar()
    // Quiz().printProgressBar()

    // val quiz = Quiz()
    // quiz.printQuiz()

    Quiz().apply { printQuiz() }
}
