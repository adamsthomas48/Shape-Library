import Shapes.NPointStar
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NPointStarTest {
    val center = Point(0.0, 0.0)
    val star = NPointStar(center, 5.0, 10)

    @Test
    fun getName() {

        assertEquals("NPoint Star", star.name)
    }

    @Test
    fun getArea() {

            assertEquals(38.62712429686842, star.getArea())
    }

    @Test
    fun move() {
        star.move(1.0, 1.0)
        assertEquals(1.0, star.center.xCoord)
        assertEquals(1.0, star.center.yCoord)
    }
}