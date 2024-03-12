package org.example

fun main(){

    val hour = TOTAL_SECONDS / SECONDS_IN_HOUR

    val minutes = TOTAL_SECONDS / MINUTES_IN_HOUR % SECONDS_IN_MINUTE

    val seconds = TOTAL_SECONDS % SECONDS_IN_MINUTE % MINUTES_IN_HOUR

    println(String.format("%02d:%02d:%02d", hour, minutes, seconds))

}

const val TOTAL_SECONDS = 6480

const val SECONDS_IN_HOUR = 3600

const val MINUTES_IN_HOUR = 60

const val SECONDS_IN_MINUTE = 60