package org.example

fun main(){

    val departureTimeHour = 9
    val departureTimeMinute = 39
    val travelTimeMinutes = 457

    val sumTime = departureTimeHour * 60 + departureTimeMinute + travelTimeMinutes
    val arriveHour = sumTime / 60
    val arriveMin = sumTime % 60
    println("$arriveHour:$arriveMin")

}

