import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PointTest {
    var point1: Point = Point(0.0, 0.0)
    var point2: Point = Point(5.0, 0.0)
    var point3: Point = Point(0.0, 5.0)

    @Test
    fun testClone() {
        val clone = point1.clone()
        assertEquals(point1.xCoord, clone.xCoord)
        assertEquals(point1.yCoord, clone.yCoord)
    }

    @Test
    fun move() {
        point1.move(4.0, 0.0)
        assertEquals(4.0, point1.xCoord)
        assertEquals(0.0, point1.yCoord)
    }

    @Test
    fun getXCoord() {
        assertEquals(5.0, point2.xCoord)
    }

    @Test
    fun getYCoord() {
        assertEquals(0.0, point2.yCoord)
    }
}