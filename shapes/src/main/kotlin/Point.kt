class Point(x: Double, y: Double) {
    var xCoord: Double = x
    var yCoord: Double = y


    fun test(){
        println("This is a test")
    }

    fun clone(): Point{
        return Point(xCoord, yCoord)
    }

    fun move(xDiff: Double, yDiff: Double) {
        xCoord += xDiff
        yCoord += yDiff
    }
}