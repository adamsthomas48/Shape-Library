class Square(var botLeftPoint: Point, var width: Double): Shape() {

    override fun getArea(): Double {
        return width * width
    }

    override fun move(xDiff: Double, yDiff: Double) {
        botLeftPoint.xCoord += xDiff
        botLeftPoint.yCoord += yDiff
    }

}