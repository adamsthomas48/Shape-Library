import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EllipseTest {
    var center = Point(0.0, 0.0)
    var ellipse = Ellipse(center, 4.0, 5.0)

    @Test
    fun getArea() {
        assertEquals(Math.PI * 4.0 * 5.0, ellipse.getArea())
    }

    @Test
    fun move() {
        ellipse.move(2.0, 1.0)

        assertEquals(2.0, center.xCoord)
        assertEquals(1.0, center.yCoord)
    }
}