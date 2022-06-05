package Questions

import Shapes.Square

class SquareQuestion(val square: Square): Question(square) {
    override val questionText: String
        get() = "What is the area of a square with a side length of ${square.width}?"
}