import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SquareTest {

    var botLeft = Point(0.0, 0.0)
    var square = Square(botLeft, 5.0)


    @Test
    fun getArea() {
        assertEquals(25.0, square.getArea())
    }

    @Test
    fun move() {
        square.move(1.0, 1.0)
        assertEquals(1.0, botLeft.xCoord, botLeft.yCoord)
    }
}