import kotlin.math.pow

fun main(){

    val clientData = 70000
    val percentage = 16.7
    val timeYears = 20

    var capitalization = clientData * ((1 + percentage / 100)).pow(timeYears)
    println("%.${3}f".format(capitalization))

}