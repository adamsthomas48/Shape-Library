import Questions.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuizTest {
    val quiz = Quiz()
    val factory = QuestionFactory()
    val questions = mutableListOf<Question>()

    @Test
    fun getQuestions() {
        val q = factory.createCircleQ()
        questions.add(q)
        quiz.addQuestion(q)
        assertEquals(questions, quiz.questions)


    }

    @Test
    fun addQuestion() {
        val q = factory.createCircleQ()
        quiz.addQuestion(q)
        assertEquals(q, quiz.questions[0])
    }

    @Test
    fun generateQuestions() {
        val quiz2 = Quiz()
        quiz2.generateQuestions(50)
        assertEquals(50, quiz2.questions.size)
    }

    @Test
    fun printQuestions() {
        val quiz2 = Quiz()
        quiz2.generateQuestions(50)
        quiz2.printQuestions()
    }

    @Test
    fun exportQuestions() {
        val quiz2 = Quiz()
        quiz2.generateQuestions(50)
        quiz2.exportQuestions("test.txt")
    }

    @Test
    fun exportAnswers() {
        val quiz2 = Quiz()
        quiz2.generateQuestions(50)
        quiz2.exportAnswers("test.json")
    }
}