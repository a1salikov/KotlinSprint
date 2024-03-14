package org.example

fun main(){

    val departureTimeHour = 9
    val departureTimeMinute = 39
    val travelTimeMinutes = 457

    val sumTime = departureTimeHour * MINUTES_IN_HOUR + departureTimeMinute + travelTimeMinutes
    val arriveHour = sumTime / MINUTES_IN_HOUR
    val arriveMin = sumTime % MINUTES_IN_HOUR
    println("$arriveHour:$arriveMin")

}

const val MINUTES_IN_HOUR = 60