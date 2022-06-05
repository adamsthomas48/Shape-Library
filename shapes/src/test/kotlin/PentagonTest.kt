import Shapes.Pentagon
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PentagonTest {
    val center = Point(0.0, 0.0)
    val pentagon = Pentagon(center, 10.0)

    @Test
    fun getName() {
        assertEquals("Pentagon", pentagon.name)

    }

    @Test
    fun getArea() {
        assertEquals(172.0477400588967, pentagon.getArea())
    }

    @Test
    fun move() {
        pentagon.move(1.0,1.0)
        assertEquals(1.0, pentagon.center.xCoord)
        assertEquals(1.0, pentagon.center.yCoord)
    }

    @Test
    fun getCenter() {
        assertEquals(center, pentagon.center)
    }

    @Test
    fun getSideLength() {
        assertEquals(10.0, pentagon.sideLength)
    }
}