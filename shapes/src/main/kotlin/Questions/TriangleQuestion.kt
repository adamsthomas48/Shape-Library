package Questions

import Shapes.Triangle

class TriangleQuestion(private val triangle: Triangle): Question(triangle) {
    override val questionText: String
        get() = ("What is the area of a triangle with the points " +
                "(${triangle.point1.xCoord}, ${triangle.point1.yCoord}) " +
                "(${triangle.point2.xCoord}, ${triangle.point2.yCoord}) " +
                "(${triangle.point3.xCoord}, ${triangle.point3.yCoord})?")
}