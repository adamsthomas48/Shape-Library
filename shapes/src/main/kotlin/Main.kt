fun main(args: Array<String>) {
    val quiz = Quiz()
    quiz.generateQuestions(8)
    quiz.printQuestions()
    quiz.printAnswers()

}