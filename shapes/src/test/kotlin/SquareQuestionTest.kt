import Questions.SquareQuestion
import Shapes.Point
import Shapes.Square
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SquareQuestionTest {
    var botLeft = Point(0.0, 0.0)
    var square = Square(botLeft, 5.0)

    @Test
    fun getQuestionText() {
        val question = SquareQuestion(square)
        assertEquals("What is the area of a square with a side length of ${square.width}?", question.questionText)

    }
}