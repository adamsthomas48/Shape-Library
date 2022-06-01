class Square(var botLeftPoint: Point, var width: Double): Rectangle(botLeftPoint, Point(botLeftPoint.xCoord + width, botLeftPoint.yCoord + width) ) {

}