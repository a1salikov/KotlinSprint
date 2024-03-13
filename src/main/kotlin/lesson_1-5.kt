package org.example

fun main(){

    val totalSeconds = 6480

    val hour = totalSeconds / SECONDS_IN_HOUR

    val minutes = totalSeconds / PARTS_IN_HOUR_OR_MINUTE % PARTS_IN_HOUR_OR_MINUTE

    val seconds = totalSeconds % PARTS_IN_HOUR_OR_MINUTE % PARTS_IN_HOUR_OR_MINUTE

    println(String.format("%02d:%02d:%02d", hour, minutes, seconds))

}

const val SECONDS_IN_HOUR = 3600
const val PARTS_IN_HOUR_OR_MINUTE = 60