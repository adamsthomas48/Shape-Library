package Shapes

class Point(var xCoord: Double, var yCoord: Double): Shape() {

    override val name = "Point"

    fun clone(): Point {
        return Point(xCoord, yCoord)
    }

    override fun getArea(): Double {
        return 0.0
    }

    override fun move(xDiff: Double, yDiff: Double) {
        xCoord += xDiff
        yCoord += yDiff
    }
}