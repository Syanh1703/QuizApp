package com.example.quizzapp

data class QuestionsList (val id:Int, val content:String, val image :Int,
                          val optionOne:String, val optionTwo:String, val optionThree:String,
val optionFour:String, val correctOption:Int)
