package Questions

import Shapes.Circle

class CircleQuestion(private val circle: Circle): Question(circle) {
    override val questionText: String
        get() = "What is the area of a circle with a radius of ${circle.radius}?"
}