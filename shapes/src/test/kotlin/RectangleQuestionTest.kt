import Questions.RectangleQuestion
import Shapes.Point
import Shapes.Rectangle
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RectangleQuestionTest {
    var point1 = Point(0.0, 0.0)
    var point2 = Point(5.0, 5.0)
    var rectangle = Rectangle(point1, point2)

    @Test
    fun getQuestionText() {
        val question = RectangleQuestion(rectangle)
        assertEquals(("What is the area of a rectangle who's bottom left point has coordinates " +
                "of(${rectangle.point1.xCoord}, ${rectangle.point1.yCoord}) " +
                "and top right point has coordinates " +
                "of (${rectangle.point2.xCoord}, ${rectangle.point2.yCoord})"),
        question.questionText)


    }
}