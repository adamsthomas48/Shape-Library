import Shapes.Circle
import Shapes.CompositeShape
import Shapes.Point
import Shapes.Rectangle
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CompositeShapeTest {
    val point1 = Point(0.0, 0.0)
    val point2 = Point(1.0, 1.0)
    val circleCenter = Point(0.0, 0.0)
    val circleRadius = 1.0
    val circle = Circle(circleCenter, circleRadius)
    val rectangle = Rectangle(point1, point2)
    val compositeShape = CompositeShape(circle, rectangle)

    @Test
    fun getName() {
        assertEquals("CompositeShape", compositeShape.name)
    }

    @Test
    fun getArea() {
        assertEquals(Math.PI * circleRadius * circleRadius + 1.0, compositeShape.getArea())
    }

    @Test
    fun move() {
        compositeShape.move(1.0, 1.0)
        assertEquals(1.0, 1.0)
    }

    @Test
    fun getShape1() {
        assertEquals(circle, compositeShape.shape1)

    }

    @Test
    fun setShape1() {
        compositeShape.shape1 = circle
        assertEquals(circle, compositeShape.shape1)
    }

    @Test
    fun getShape2() {
        assertEquals(rectangle, compositeShape.shape2)
    }

    @Test
    fun setShape2() {
        compositeShape.shape2 = rectangle
        assertEquals(rectangle, compositeShape.shape2)
    }
}