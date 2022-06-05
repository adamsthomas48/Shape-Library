package Questions

import Shapes.Circle
import Shapes.Point
import Shapes.Shape

import Shapes.*

class QuestionFactory() {
    fun createCircleQ(): Question {
        //create Circle with random Point and radius
        val center = Point(genRandomDouble(), genRandomDouble())
        val radius = genRandomDouble()
        val circle = Circle(center, radius)

        // create new CircleQuestion
        return CircleQuestion(circle)
    }

    fun createRectangleQ(): Question {
        //create Rectangle with two random points
        val p1 = Point(genRandomDouble(), genRandomDouble())
        val p2 = Point(genRandomDouble(), genRandomDouble())
        val rectangle = Rectangle(p1, p2)

        // create new RectangleQuestion
        return RectangleQuestion(rectangle)
    }

    fun createSquareQ(): Question {
        //create Square with random Point and side length
        val point = Point(genRandomDouble(), genRandomDouble())
        val width = genRandomDouble()
        val square = Square(point, width)

        // create new SquareQuestion
        return SquareQuestion(square)
    }

    fun createEllipseQ(): Question {
        //create Ellipse with random Point and radii
        val center = Point(genRandomDouble(), genRandomDouble())
        val radiusX = genRandomDouble()
        val radiusY = genRandomDouble()
        val ellipse = Ellipse(center, radiusX, radiusY)

        // create new EllipseQuestion
        return EllipseQuestion(ellipse)
    }

    fun createTriangleQ(): Question {
        //create Triangle with three random Points
        val p1 = Point(genRandomDouble(), genRandomDouble())
        val p2 = Point(genRandomDouble(), genRandomDouble())
        val p3 = Point(genRandomDouble(), genRandomDouble())
        val triangle = Triangle(p1, p2, p3)

        // create new TriangleQuestion
        return TriangleQuestion(triangle)
    }

    // return a random double between 0 and 100 rounded to the nearest whole number
    fun genRandomDouble(): Double {
        return Math.round(Math.random() * 100.0).toDouble()
    }





}