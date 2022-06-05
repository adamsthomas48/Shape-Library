package Shapes

import kotlin.math.pow
import kotlin.math.sqrt

class Line(var point1: Point, var point2: Point): Shape() {
    override val name = "Shapes.Line"

    fun getLength(): Double {
        val x = point2.xCoord - point1.xCoord
        val y = point2.yCoord - point1.yCoord

        return sqrt(x.pow(2) + y.pow(2))
    }

    fun getSlope(): Double{
        val x = point2.xCoord - point1.xCoord
        val y = point2.yCoord - point1.yCoord

        return y/x
    }

    override fun getArea(): Double {
        return 0.00
    }

    override fun move(xDiff: Double, yDiff: Double){
        point1.move(xDiff, yDiff)
        point2.move(xDiff, yDiff)

    }
}