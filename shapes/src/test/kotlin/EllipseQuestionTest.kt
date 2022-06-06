import Questions.EllipseQuestion
import Shapes.Ellipse
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EllipseQuestionTest {
    var center = Point(0.0, 0.0)
    var ellipse = Ellipse(center, 4.0, 5.0)

    @Test
    fun getQuestionText() {
        val question = EllipseQuestion(ellipse)
        assertEquals("What is the area of an ellipse with a horizontal radius of ${ellipse.xRadius} and a vertical radius of ${ellipse.yRadius}?",
        question.questionText)

    }
}