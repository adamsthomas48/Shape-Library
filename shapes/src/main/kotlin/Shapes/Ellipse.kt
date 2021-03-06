package Shapes

open class Ellipse(open var center: Point, var xRadius: Double, var yRadius: Double): Shape() {
    override val name = "Shapes.Ellipse"
    override fun getArea(): Double {
        return Math.PI * xRadius * yRadius
    }

    override fun move(xDiff: Double, yDiff: Double) {
        center.move(xDiff, yDiff)
    }

}