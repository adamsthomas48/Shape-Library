import Questions.Question
import kotlin.random.Random

class Test(val questionCount: Int) {
    val questions = mutableListOf<Question>()

    fun generateQuestions() {
        for (i in 1..questionCount) {
            val randomNum = Random.nextInt(1, 9)


        }
    }

    fun addQuestion(question: Question) {
        questions.add(question)
    }
}