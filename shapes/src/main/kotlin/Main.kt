fun main(args: Array<String>) {
    val quiz = Quiz()
    quiz.generateQuestions(50)
    quiz.printQuestions()
    quiz.exportAnswers("answers.json")
    quiz.exportQuestions("questions.txt")

}