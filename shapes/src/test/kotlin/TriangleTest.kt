import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TriangleTest {
    var point1 = Point(0.0, 0.0)
    var point2 = Point(5.0, 0.0)
    var point3 = Point(0.0, 4.0)

    var triangle = Triangle(point1, point2, point3)


    @Test
    fun getArea() {
        assertEquals(10.0, triangle.getArea())
    }

    @Test
    fun move() {
        triangle.move(1.0, 1.0)
        assertEquals(1.0, point1.xCoord)
        assertEquals(1.0, point1.yCoord)

        assertEquals(6.0, point2.xCoord)
        assertEquals(1.0, point2.yCoord)

        assertEquals(1.0, point3.xCoord)
        assertEquals(5.0, point3.yCoord)
    }
}