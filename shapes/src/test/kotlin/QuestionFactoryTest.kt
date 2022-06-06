import Questions.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuestionFactoryTest {
    val factory = QuestionFactory()

    @Test
    fun createCircleQ() {
        val q = factory.createCircleQ()
        assertTrue(q is CircleQuestion)
    }

    @Test
    fun createRectangleQ() {
        val q = factory.createRectangleQ()
        assertTrue(q is RectangleQuestion)
    }

    @Test
    fun createSquareQ() {
        val q = factory.createSquareQ()
        assertTrue(q is SquareQuestion)
    }

    @Test
    fun createEllipseQ() {
        val q = factory.createEllipseQ()
        assertTrue(q is EllipseQuestion)
    }

    @Test
    fun createTriangleQ() {
        val q = factory.createTriangleQ()
        assertTrue(q is TriangleQuestion)
    }

    @Test
    fun createPentagonQ() {
        val q = factory.createPentagonQ()
        assertTrue(q is PentagonQuestion)
    }

    @Test
    fun createNPointStarQ() {
        val q = factory.createNPointStarQ()
        assertTrue(q is NPointStarQuestion)
    }

    @Test
    fun genRandomDouble() {
        val d = factory.genRandomDouble()
        assertTrue(d in 0.0..100.0)
    }
}