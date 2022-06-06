import Questions.NPointStarQuestion
import Shapes.NPointStar
import Shapes.Point
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NPointStarQuestionTest {
    val center = Point(0.0, 0.0)
    val star = NPointStar(center, 5.0, 10)

    @Test
    fun getQuestionText() {
        val question = NPointStarQuestion(star)
        assertEquals("What is the area of a star with ${star.points} points? and a radius of ${star.radius}?",
        question.questionText)

    }
}