package Shapes

class NPointStar(var center: Point, var radius: Double, var points: Int): Shape() {
    override val name = "N-Shapes.Point Star"
    override fun getArea(): Double {
        return Math.PI * radius * radius * points / (points - 2)
    }

    override fun move(xDiff: Double, yDiff: Double) {
        center.move(xDiff, yDiff)
    }


}