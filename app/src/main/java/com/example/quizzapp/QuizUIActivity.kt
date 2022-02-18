package com.example.quizzapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_uiactivity.*

class QuizUIActivity : AppCompatActivity() {

    private var mCurrentPosition :Int = 1//get the position of the question
    private var mQuestionsList :ArrayList<QuestionsList>? = null
    private var mCurrentSelectedOption : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_uiactivity)

        setQuestions()

    }

    private fun setQuestions()
    {
        mQuestionsList = Constants.getQuestions()

        //Start with the first question
        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition-1]
        defaultOptionsView() //Make sure all the elements are back to the default

        //Update the progress bar
        progressBarQues.progress = mCurrentPosition
        progressTxtView.text = "$mCurrentPosition" + "/" + progressBarQues.max
        txtViewQuestionID.text = question!!.content
        imView.setImageResource(question.image)

        //Assign the answers
        txtViewOptionOne.text = question.optionOne
        txtViewOptionTwo.text = question.optionTwo
        txtViewOptionThree.text = question.optionThree
        txtViewOptionFour.text = question.optionFour
    }

    private fun defaultOptionsView()
    {
        val options = ArrayList<TextView>()
        options.add(0, txtViewOptionOne)
        options.add(1, txtViewOptionTwo)
        options.add(2,txtViewOptionThree)
        options.add(3, txtViewOptionFour)

        //Make sure everything is by default

        for(option in options)
        {
            option.setTextColor(Color.parseColor(R.color.lightGray.toString()))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_answer_border)
        }
    }
}