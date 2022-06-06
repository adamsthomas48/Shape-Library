import Questions.CircleQuestion
import Shapes.Circle
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CircleQuestionTest {
    val center = Point(0.0, 0.0)
    val circle = Circle(center, 1.0)

    @Test
    fun getQuestionText() {
        val question = CircleQuestion(circle)
        assertEquals("What is the area of a circle with a radius of ${circle.radius}?", question.questionText)
    }
}