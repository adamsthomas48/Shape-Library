import kotlin.math.pow
import kotlin.math.sqrt

abstract class Shape {

    abstract fun getArea(): Double


    abstract fun move(xDiff: Double, yDiff: Double)
}