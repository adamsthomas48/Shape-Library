import Point

fun main(args: Array<String>) {
    println("Hello World!")
    val p1 = Point(0.0, 0.0)
    val p2 = Point(0.0, 4.0)
    val cir = Circle(p1, 10.0)
    val line = Line(p1, p2)

    println(line.getLength())
    println(cir.getArea())
}