class Rectangle(var point1: Point, var point2: Point): Shape() {

    override fun getArea(): Double {
        val x = point2.xCoord - point1.xCoord
        val y = point2.yCoord - point1.yCoord

        return x * y
    }

    override fun move(xDiff: Double, yDiff: Double) {
        point1.move(xDiff, yDiff)
        point2.move(xDiff, yDiff)
    }

}