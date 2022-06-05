package Shapes

class CompositeShape(var shape1: Shape, var shape2: Shape): Shape() {
    override val name = "Shapes.CompositeShape"
    override fun getArea(): Double {
        return shape1.getArea() + shape2.getArea()
    }

    override fun move(xDiff: Double, yDiff: Double) {
        shape1.move(xDiff, yDiff)
        shape2.move(xDiff, yDiff)
    }


}