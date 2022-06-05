package Shapes

class Circle(override var center: Point, var radius: Double): Ellipse(center, radius, radius) {
    // Shapes.Circle implements all functionality from Shapes.Ellipse but is only constructed with two parameters instead of three
    override val name = "Circle"
}