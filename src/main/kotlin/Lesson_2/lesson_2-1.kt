package org.example.Lesson_2

fun main(){

    getAverageScore()

}

fun getAverageScore(){

    val averageScore = (FIRST_PUPIL_SCORE + SECOND_PUPIL_SCORE + THIRD_PUPIL_SCORE + FORTH_PUPIL_SCORE) / 4

    println(String.format("%.2f", averageScore))

}

const val FIRST_PUPIL_SCORE = 3f
const val SECOND_PUPIL_SCORE = 4f
const val THIRD_PUPIL_SCORE = 3f
const val FORTH_PUPIL_SCORE = 5f