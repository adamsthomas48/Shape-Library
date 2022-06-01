class Pentagon(var point1: Point,
                var point2: Point,
                var point3: Point,
                var point4: Point,
                var point5: Point): Shape() {
    override fun getArea(): Double {
        val x1y2 = (point1.xCoord * point2.yCoord) - (point1.yCoord * point2.xCoord)
        val x2y3 = (point2.xCoord * point3.yCoord) - (point2.yCoord * point3.xCoord)
        val x3y4 = (point3.xCoord * point4.yCoord) - (point3.yCoord * point4.xCoord)
        val x4y5 = (point4.xCoord * point5.yCoord) - (point4.yCoord * point5.xCoord)
        val x5y1 = (point5.xCoord * point1.yCoord) - (point5.yCoord * point1.xCoord)

        return Math.abs((x1y2 + x2y3 + x3y4 + x4y5 + x5y1) / 2)

    }

    override fun move(xDiff: Double, yDiff: Double) {
        point1.move(xDiff, yDiff)
        point2.move(xDiff, yDiff)
        point3.move(xDiff, yDiff)
        point4.move(xDiff, yDiff)
        point5.move(xDiff, yDiff)
    }

}
