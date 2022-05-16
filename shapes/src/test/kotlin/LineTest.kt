import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.sqrt

internal class LineTest {
    var point1 = Point(0.0, 0.0)
    var point2 = Point(2.0, 1.0)
    var line = Line(point1, point2)

    @Test
    fun getLength() {
        assertEquals(sqrt(5.0), line.getLength())
    }

    @Test
    fun getSlope() {
        assertEquals(0.5, line.getSlope())
    }

    @Test
    fun getArea() {
        assertEquals(0.0, line.getArea())
    }

    @Test
    fun move() {
        line.move(1.0, 1.0)

        assertEquals(1.0, point1.xCoord)
        assertEquals(1.0, point1.yCoord)

        assertEquals(3.0, point2.xCoord)
        assertEquals(2.0, point2.yCoord)
    }

}