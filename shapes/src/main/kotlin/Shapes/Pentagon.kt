package Shapes

class Pentagon(var center: Point, var sideLength: Double): Shape() {
    override val name = "Shapes.Pentagon"
    override fun getArea(): Double {
        return (5 * sideLength * sideLength * Math.sqrt(25 + 10 * Math.sqrt(5.0)) / 4)
    }


    override fun move(xDiff: Double, yDiff: Double) {
        center.move(xDiff, yDiff)
    }

}
