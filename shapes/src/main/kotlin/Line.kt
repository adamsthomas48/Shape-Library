import java.lang.Math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class Line(p1: Point, p2: Point) {
    var point1: Point = p1
    var point2: Point = p2

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

    fun move(xDiff: Double, yDiff: Double){
        point1.move(xDiff, yDiff)
        point2.move(xDiff, yDiff)
        
    }
}