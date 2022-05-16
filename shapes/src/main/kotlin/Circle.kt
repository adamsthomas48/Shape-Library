class Circle(override var center: Point, var radius: Double): Ellipse(center, radius, radius) {
    // Circle implements all functionality from Ellipse but is only constructed with two parameters instead of three
}