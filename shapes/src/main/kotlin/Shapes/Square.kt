package Shapes

class Square(var botLeftPoint: Point, var width: Double): Rectangle(botLeftPoint,
    Point(botLeftPoint.xCoord + width, botLeftPoint.yCoord + width)
) {
    override val name = "Shapes.Square"
}