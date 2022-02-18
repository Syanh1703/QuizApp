package com.example.quizzapp

object Constants
{
    const val ENGLAND :String = "England"
    const val GREECE :String = "Greece"
    const val GERMANY :String = "Germany"
    const val AUSTRALIA :String = "Australia"
    const val DENMARK :String = "Denmark"
    const val NETHERLANDS :String = "Netherlands"
    const val ARGENTINA :String = "Argentina"
    const val ITALY :String = "Italy"
    const val NEWZEALAND :String = "New Zealand"
    const val CHINA :String = "China"
    const val KOREA :String = "Korea"
    const val AUSTRIA :String = "Austria"
    const val POLAND :String = "Poland"
    const val MONGOLIA :String = "Mongolia"
    const val VIETNAM :String = "Vietnam"
    const val SINGAPORE :String = "Singapore"
    const val JAPAN :String = "Japan"
    const val KUWAIT :String = "Kuwait"
    const val SWEDEN :String = "Sweden"
    const val SWITZERLAND :String = "Switzerland"

    //Soccer
    const val RONALDO :String = "Cristiano Ronaldo"
    const val ROONEY :String = "Wayne Rooney"
    const val BENZEMA :String = "Karim Benzema"
    const val BALE :String = "Gareth Bale"
    const val MESSI:String = "Lionel Messi"
    const val GREENWOOD :String = "Greenwood"
    const val DROGBA :String = "Drogba"
    const val DEGEA :String = "De Gea"
    const val QUESTION :String = "Which country is this?"
    const val QUESTION_ABOUT_SOCCER :String = "Who is this player?"

    fun getQuestions():ArrayList<QuestionsList>
    {
        val questionsList = ArrayList<QuestionsList>()

        val ques1 = QuestionsList(1, QUESTION, R.drawable.australia, AUSTRALIA,
            GREECE, ENGLAND, AUSTRIA, 1)
        questionsList.add(ques1)

        val ques2 = QuestionsList(2, QUESTION_ABOUT_SOCCER, R.drawable.messi, BENZEMA, RONALDO, ROONEY, MESSI,4 )
        questionsList.add(ques2)

        val ques3 = QuestionsList(3, QUESTION, R.drawable.netherlands, SWITZERLAND, AUSTRIA, SWEDEN, NETHERLANDS, 4)
        questionsList.add(ques3)

        val ques4 = QuestionsList(4, QUESTION_ABOUT_SOCCER, R.drawable.bale, ROONEY, BALE, MESSI, RONALDO, 2)
        questionsList.add(ques4)

        val ques5 = QuestionsList(5, QUESTION, R.drawable.germany, VIETNAM, GERMANY, POLAND, DENMARK, 2)
        questionsList.add(ques5)

        val ques6 = QuestionsList(6, QUESTION_ABOUT_SOCCER, R.drawable.degea, MESSI, RONALDO, DEGEA, DROGBA, 3 )
        questionsList.add(ques6)

        return questionsList
    }
}