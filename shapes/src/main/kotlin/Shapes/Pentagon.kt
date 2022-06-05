package Shapes

class Pentagon(val center: Point, val sideLength: Double): Shape() {
    override val name = "Pentagon"
    override fun getArea(): Double {
        // return area of regular pentagon with side length of sideLength
        return (Math.sqrt(5.0 * (5.0 + 2.0 * Math.sqrt(5.0))) * sideLength * sideLength) / 4.0
    }


    override fun move(xDiff: Double, yDiff: Double) {
        center.move(xDiff, yDiff)
    }

}
