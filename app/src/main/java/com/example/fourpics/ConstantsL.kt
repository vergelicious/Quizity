package com.example.fourpics

object ConstantsL{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<LuzonQuestions>{
        val questionsList = ArrayList<LuzonQuestions>()

        val questionLuz1 = LuzonQuestions(
            1,
            "LUZON PICTURE #1",
             R.drawable.burnhampark, // burnham park
            "Baler",
            "Baguio City",
            "Batanes",
            "Cebu",
            2
            )
        questionsList.add(questionLuz1)

        val questionLuz2 = LuzonQuestions(
            2,
            "LUZON PICTURE #2",
            R.drawable.callecrisollogo, // calle crisollogo
            "Vigan City",
            "Banaue",
            "Bolinao",
            "Palawan",
            1
        )
        questionsList.add(questionLuz2)

        val questionLuz3 = LuzonQuestions(
            3,
            "LUZON PICTURE #3",
            R.drawable.sagada, // sagada
            "Baguio City",
            "Leyte",
            "Negros Occidental",
            "Mt. Province",
            4
        )
        questionsList.add(questionLuz3)

        val questionLuz4 = LuzonQuestions(
            4,
            "LUZON PICTURE #4",
            R.drawable.morongbeach, // morong beach
            "Batanes",
            "Tagaytay",
            "Palawan",
            "Negros Occidental",
            1
        )
        questionsList.add(questionLuz4)

        val questionLuz5 = LuzonQuestions(
            5,
            "LUZON PICTURE #5",
            R.drawable.patarwhitebeach, // patar white beach
            "Kapiz",
            "Cebu",
            "Bolinao",
            "Negros",
            3
        )
        questionsList.add(questionLuz5)

        val questionLuz6 = LuzonQuestions(
            6,
            "LUZON PICTURE #6",
            R.drawable.banauericeterraces, // banaue rice terraces
            "Marawi City",
            "Dapitan City",
            "Vigan City",
            "Banaue",
            4
        )
        questionsList.add(questionLuz6)

        val questionLuz7 = LuzonQuestions(
            7,
            "LUZON PICTURE #7",
            R.drawable.taalvolcano, // taal volcano
            "Corregidor Island",
            "Baguio City",
            "Bicol",
            "Tagaytay",
            4
        )
        questionsList.add(questionLuz7)

        val questionLuz8 = LuzonQuestions(
            8,
            "LUZON PICTURE #8",
            R.drawable.pacificwar, // pacific war memorial
            "Tagaytay",
            "Corregidor Island",
            "Tagum",
            "Palawan",
            2
        )
        questionsList.add(questionLuz8)

        val questionLuz9 = LuzonQuestions(
            9,
            "LUZON PICTURE #9",
            R.drawable.mayonvolcano, // mayon volcano
            "Bicol",
            "Cebu",
            "Banaue",
            "Ilocos Norte",
            1
        )
        questionsList.add(questionLuz9)

        val questionLuz10 = LuzonQuestions(
            10,
            "LUZON PICTURE #10",
            R.drawable.sabangbeach, // sabang beach
            "Baler",
            "Bolinao",
            "Bohol",
            "Romblon",
            1
        )
        questionsList.add(questionLuz10)

        return questionsList
    }

}