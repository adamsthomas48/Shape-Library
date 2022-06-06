package Questions

import Shapes.NPointStar

class NPointStarQuestion(private val star: NPointStar): Question(star) {
    override val questionText: String
        get() = "What is the area of a star with ${star.points} points? and a radius of ${star.radius}?"

}