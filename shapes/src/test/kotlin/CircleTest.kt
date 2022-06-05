
import Shapes.Circle
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CircleTest {
    val center = Point(0.0, 0.0)
    val circle = Circle(center, 1.0)

    @Test
    fun getName() {
        assertEquals("Circle", circle.name)

    }

    @Test
    fun getCenter() {
        assertEquals(center, circle.center)
    }

    @Test
    fun setCenter() {
        val newCenter = Point(1.0, 1.0)
        circle.center = newCenter
        assertEquals(newCenter, circle.center)
    }

    @Test
    fun getRadius() {
        assertEquals(1.0, circle.radius)
    }

    @Test
    fun getArea() {
        assertEquals(Math.PI, circle.getArea())
    }

}