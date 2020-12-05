package com.example.fourpics

object ConstantsM {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestionsM(): ArrayList<MindanaoQuestions> {
        val questionsListM = ArrayList<MindanaoQuestions>()

        val questionMin1 = MindanaoQuestions(
                1,
                "MINDANAO PICTURE #1",
                R.drawable.mountapo, // mt. apo
                "Tagum",
                "Baguio City",
                "Negros Oriental",
                "Davao City",
                4
        )
        questionsListM.add(questionMin1)

        val questionMin2 = MindanaoQuestions(
            2,
            "MINDANAO PICTURE #2",
            R.drawable.mapawanaturepark, // mapawa nature park
            "Bohol",
            "Cagayan De Oro",
            "Tagaytay",
            "Marawi City",
            2
        )
        questionsListM.add(questionMin2)

        val questionMin3 = MindanaoQuestions(
            3,
            "MINDANAO PICTURE #3",
            R.drawable.basulaisland, // basul island
            "Cotabato City",
            "Ilocos Sur",
            "La Union",
            "Surigao City",
            4
        )
        questionsListM.add(questionMin3)

        val questionMin4 = MindanaoQuestions(
            4,
            "MINDANAO PICTURE #4",
            R.drawable.magellansanchorage, // magellan's anchorage
            "Butuan City",
            "Tagaytay",
            "Baler",
            "Romblon",
            1
        )
        questionsListM.add(questionMin4)

        val questionMin5 = MindanaoQuestions(
            5,
            "MINDANAO PICTURE #5",
            R.drawable.tinagofalls, // tinago falls
            "Leyte",
            "Dapitan City",
            "Iligan City",
            "Kapiz",
            3
        )
        questionsListM.add(questionMin5)

        val questionMin6 = MindanaoQuestions(
            6,
            "MINDANAO PICTURE #6",
            R.drawable.timakohills, // timako hill
            "Iloilo",
            "Banaue",
            "Cotabato City",
            "General Santos City",
            3
        )
        questionsListM.add(questionMin6)

        val questionMin7 = MindanaoQuestions(
            7,
            "MINDANAO PICTURE #7",
            R.drawable.lakebeto, // lake beto
            "Antique",
            "Kapiz",
            "Baguio City",
            "General Santos City",
            4
        )
        questionsListM.add(questionMin7)

        val questionMin8 = MindanaoQuestions(
            8,
            "MINDANAO PICTURE #8",
            R.drawable.largestrosaryintheworld, // largest rosary in the world
            "Bolinao",
            "Baler",
            "Tagum",
            "Marawi City",
            3
        )
        questionsListM.add(questionMin8)

        val questionMin9 = MindanaoQuestions(
            9,
            "MINDANAO PICTURE #9",
            R.drawable.sacredmountain, // sacred mountain national park
            "Ilocos Norte",
            "Batanes",
            "Tagum",
            "Dapitan City",
            4
        )
        questionsListM.add(questionMin9)

        val questionMin10 = MindanaoQuestions(
            10,
            "MINDANAO PICTURE #10",
            R.drawable.steps, // 3003 steps linabo peak
            "Ilocos Sur",
            "Batanes",
            "Tagum",
            "Dapitan City",
            4
        )
        questionsListM.add(questionMin10)

        return questionsListM
    }
}