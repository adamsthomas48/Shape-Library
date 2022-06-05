package Questions

import Shapes.Shape

abstract class Question(val shape: Shape) {
    abstract val questionText: String
    val answer: String = shape.getArea().toString()

}