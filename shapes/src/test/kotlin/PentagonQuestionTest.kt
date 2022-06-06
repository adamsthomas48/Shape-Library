import Questions.PentagonQuestion
import Shapes.Pentagon
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PentagonQuestionTest {
    val center = Point(0.0, 0.0)
    val pentagon = Pentagon(center, 10.0)

    @Test
    fun getQuestionText() {
        val question = PentagonQuestion(pentagon)
        assertEquals("What is the area of a regular pentagon with side length ${pentagon.sideLength}?",
        question.questionText)

    }
}