import Questions.TriangleQuestion
import Shapes.Point
import Shapes.Triangle
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TriangleQuestionTest {
    var point1 = Point(0.0, 0.0)
    var point2 = Point(5.0, 0.0)
    var point3 = Point(0.0, 4.0)

    var triangle = Triangle(point1, point2, point3)

    @Test
    fun getQuestionText() {
        val question = TriangleQuestion(triangle)
        assertEquals(("What is the area of a triangle with the points " +
                "(${triangle.point1.xCoord}, ${triangle.point1.yCoord}) " +
                "(${triangle.point2.xCoord}, ${triangle.point2.yCoord}) " +
                "(${triangle.point3.xCoord}, ${triangle.point3.yCoord})?"),
        question.questionText)


    }
}