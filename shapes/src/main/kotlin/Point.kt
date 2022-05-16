class Point(var xCoord: Double, var yCoord: Double) {

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