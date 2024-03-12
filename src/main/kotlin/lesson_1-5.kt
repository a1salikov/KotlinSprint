package org.example

fun main(){

    val totalSeconds = 6480

    val hour = totalSeconds / 3600

    val minutes = totalSeconds / 60 % 60

    val seconds = totalSeconds / 60 / 60 % 60

}
