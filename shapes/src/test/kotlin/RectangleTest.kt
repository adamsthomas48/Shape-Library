import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RectangleTest {
    var point1 = Point(0.0, 0.0)
    var point2 = Point(5.0, 5.0)
    var rectangle = Rectangle(point1, point2)

    @Test
    fun getArea() {
        assertEquals(25.0, rectangle.getArea())
    }

    @Test
    fun move() {
        rectangle.move(1.0, 1.0)
        assertEquals(1.0, point1.xCoord)
        assertEquals(1.0, point1.yCoord)

        assertEquals(6.0, point2.xCoord)
        assertEquals(6.0, point2.yCoord)
    }
}