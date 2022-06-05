package Shapes

class NPointStar(center: Point, radius: Double, points: Int): Shape() {
    val center = center
        get() = field
    val radius = radius
        get() = field
    val points = points
        get() = field

    override val name = "NPoint Star"

    override fun getArea(): Double {
        //return Math.PI * radius * radius * points / (points - 2)
        // Find the area of a star with n points inscribed in a circle of radius r
        return (points/2).toDouble() * (radius * radius) * Math.sin(Math.PI / points.toDouble())
    }

    override fun move(xDiff: Double, yDiff: Double) {
        center.move(xDiff, yDiff)
    }


}