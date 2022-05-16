import kotlin.math.pow
import kotlin.math.sqrt

abstract class Shape {

    // Calculates the area of a shape based on what type it is
    abstract fun getArea(): Double

    // Moves all points for a shape by an x differential and a y differential
    abstract fun move(xDiff: Double, yDiff: Double)
}