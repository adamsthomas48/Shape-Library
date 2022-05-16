import kotlin.math.abs

class Triangle(var point1: Point, var point2: Point, var point3: Point): Shape() {
    override fun getArea(): Double {
        val bc: Double = point2.yCoord - point3.yCoord
        val ca: Double = point3.yCoord - point1.yCoord
        val ab: Double = point1.yCoord - point2.yCoord

        return abs(((point1.xCoord * bc) + (point2.xCoord * ca) + (point3.xCoord * ab)) / 2)

    }

    override fun move(xDiff: Double, yDiff: Double) {
        point1.xCoord += xDiff
        point1.yCoord += yDiff

        point2.xCoord += xDiff
        point2.yCoord += yDiff

        point3.xCoord += xDiff
        point3.yCoord += yDiff
    }


}