import kotlin.math.pow
import kotlin.math.sqrt

abstract class Shape {

//    fun getArea(point1: Point, point2: Point): Double {
//        val x = point2.xCoord - point1.xCoord
//        val y = point2.yCoord - point1.yCoord
//
//        return x * y
//    }

//    fun getLength(point1: Point, point2: Point): Double {
//        val x = point2.xCoord - point1.xCoord
//        val y = point2.yCoord - point1.yCoord
//
//        return sqrt(x.pow(2) + y.pow(2))
//    }

    abstract fun getArea(): Double


    abstract fun move(xDiff: Double, yDiff: Double)
}