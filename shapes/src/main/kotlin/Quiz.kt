import Questions.*
import com.google.gson.Gson
import java.io.File

class Quiz {
    val questions = arrayListOf<Question>()


    fun addQuestion(question: Question) {
        questions.add(question)
    }

    fun generateQuestions(questionCount: Int) {
        val factory = QuestionFactory()
        val shapeOptions = arrayListOf("Circle", "Rectangle", "Square", "Triangle", "Ellipse", "Star", "Pentagon")
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
                "Star" -> factory.createNPointStarQ()
                "Pentagon" -> factory.createPentagonQ()
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

    fun exportQuestions(fileName: String) {
        val file = File(fileName)
        var questionNumber = 0
        for(question in questions) {
            file.appendText("${++questionNumber}: " + question.questionText + "\n")
        }
    }



    fun exportAnswers(fileName: String) {
        val file = File(fileName)
        // convert answers to json
        val answers = createDictionary()
        val json = Gson().toJson(answers)
        file.writeText(json)
    }

    private fun createDictionary(): HashMap<Int, String> {
        val dictionary = HashMap<Int, String>()
        for(question in questions) {
            // put index of question in questions and questionText in dictionary
            dictionary.put(questions.indexOf(question) + 1, question.answer)
        }
        return dictionary
    }
}