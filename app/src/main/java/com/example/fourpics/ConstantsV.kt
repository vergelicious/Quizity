package com.example.fourpics

object ConstantsV {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestionsV(): ArrayList<VisayasQuestions> {
        val questionsListV = ArrayList<VisayasQuestions>()

        val questionVis1 = VisayasQuestions(
                1,
                "VISAYAS PICTURE #1",
                R.drawable.kawasanfalls, // kawasan falls
                "Masbate",
                "Cebu",
                "Negros Occidental",
                "Dapitan City",
                2
        )
        questionsListV.add(questionVis1)

        val questionVis2 = VisayasQuestions(
            2,
            "VISAYAS PICTURE #2",
            R.drawable.chocolatehills, // Chocolate hills
            "Ilocos Sur",
            "Leyte",
            "Bohol",
            "Iloilo",
            3
        )
        questionsListV.add(questionVis2)

        val questionVis3 = VisayasQuestions(
            3,
            "VISAYAS PICTURE #3",
            R.drawable.sanjuanicobridge, // San juanico bridge
            "Leyte",
            "Negros Oriental",
            "Bohol",
            "Cebu",
            1
        )
        questionsListV.add(questionVis3)

        val questionVis4 = VisayasQuestions(
            4,
            "VISAYAS PICTURE #4",
            R.drawable.sibuyanisland, // sibuyan island
            "Palawan",
            "Romblon",
            "Kapiz",
            "Leyte",
            2
        )
        questionsListV.add(questionVis4)

        val questionVis5 = VisayasQuestions(
            5,
            "VISAYAS PICTURE #5",
            R.drawable.palaniwhitebeach, // palani white beach
            "Masbate",
            "Antique",
            "Marawi City",
            "Baguio City",
            1
        )
        questionsListV.add(questionVis5)

        val questionVis6 = VisayasQuestions(
            6,
            "VISAYAS PICTURE #6",
            R.drawable.coron, // coron
            "Surigao",
            "Butuan",
            "Palawan",
            "Iloilo",
            3
        )
        questionsListV.add(questionVis6)

        val questionVis7 = VisayasQuestions(
            7,
            "VISAYAS PICTURE #7",
            R.drawable.sugarbeachsipalay, // sugar beach of sipalay
            "Dapitan City",
            "Negros Occidental",
            "Cagayan De Oro",
            "Surigao",
            2
        )
        questionsListV.add(questionVis7)

        val questionVis8 = VisayasQuestions(
            8,
            "VISAYAS PICTURE #8",
            R.drawable.culasi, // culasi
            "Marawi City",
            "Iloilo",
            "Kapiz",
            "Antique",
            4
        )
        questionsListV.add(questionVis8)

        val questionVis9 = VisayasQuestions(
            9,
            "VISAYAS PICTURE #9",
            R.drawable.baybaybeach, // baybay beach
            "Iloilo",
            "Baler",
            "Kapiz",
            "Cagayan De Oro",
            3
        )
        questionsListV.add(questionVis9)

        val questionVis10 = VisayasQuestions(
            10,
            "VISAYAS PICTURE #10",
            R.drawable.gigantesisland, // gigantes island
            "Iloilo",
            "Kapiz",
            "Palawan",
            "Leyte",
            1
        )
        questionsListV.add(questionVis10)

        return questionsListV
    }
}