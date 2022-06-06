package Questions

import Shapes.Shape

abstract class Question(val shape: Shape) {
    abstract val questionText: String

    //round answer to nearest integer
    val answer: String = shape.getArea().toInt().toString()

}