import Point

fun main(args: Array<String>) {
    println("Hello World!")
    val p1 = Point(0.0, 0.0)
    val p2 = Point(0.0, 4.0)
    val p3 = Point(4.0, 4.0)
    val cir = Circle(p1, 10.0)
    val line = Line(p1, p2)

    val triangle = Triangle(p1, p2, p3)

    println(line.getLength())
    println(triangle.getArea())
}