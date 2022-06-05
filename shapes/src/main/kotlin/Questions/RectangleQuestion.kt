package Questions

import Shapes.Rectangle

class RectangleQuestion(private val rectangle: Rectangle): Question(rectangle) {
    override val questionText: String
        get() = ("What is the area of a rectangle who's bottom left point has coordinates " +
                "of(${rectangle.point1.xCoord}, ${rectangle.point1.yCoord}) " +
                "and top right point has coordinates " +
                "of (${rectangle.point2.xCoord}, ${rectangle.point2.yCoord})")
}