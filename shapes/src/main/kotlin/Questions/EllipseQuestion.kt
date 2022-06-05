package Questions

import Shapes.Ellipse

class EllipseQuestion(val ellipse: Ellipse): Question(ellipse) {
    override val questionText: String
        get() = "What is the area of an ellipse with a horizontal radius of ${ellipse.xRadius} and a vertical radius of ${ellipse.yRadius}?"

}
