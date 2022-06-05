package Questions

import Shapes.Pentagon

class PentagonQuestion(val pentagon: Pentagon): Question(pentagon) {
    override val questionText: String
        get() = ("What is the area of a regular pentagon with side length ${pentagon.sideLength}?")
}
