import Questions.*
import java.io.File

class Quiz {
    val questions = arrayListOf<Question>()


    fun addQuestion(question: Question) {
        questions.add(question)
    }

    fun generateQuestions(questionCount: Int) {
        val factory = QuestionFactory()
        val shapeOptions = arrayListOf("Circle", "Rectangle", "Square", "Triangle", "Ellipse")
        // for loop from 0 to questionCount

        for (i in 0 until questionCount) {
            //pick a random item from shapeOptions
            val shape = shapeOptions.random()

            val question = when (shape) {
                "Circle" -> factory.createCircleQ()
                "Rectangle" -> factory.createRectangleQ()
                "Square" -> factory.createSquareQ()
                "Triangle" -> factory.createTriangleQ()
                "Ellipse" -> factory.createEllipseQ()
                else -> throw Exception("Invalid shape")
            }
            addQuestion(question)
        }


    }


    fun printQuestions() {
        var questionNumber = 0
        for (question in questions) {
            print("${++questionNumber}: ")
            println(question.questionText)
        }



    }

    fun printAnswers() {
        for (question in questions) {
            println(question.answer)
        }
    }

    //create a json file of answers

    private fun createDictionary(): HashMap<Int, String> {
        val dictionary = HashMap<Int, String>()
        for(question in questions) {
            // put index of question in questions and questionText in dictionary
            dictionary.put(questions.indexOf(question), question.answer)
        }
        return dictionary
    }
}