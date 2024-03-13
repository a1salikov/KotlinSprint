import kotlin.math.pow

fun main(){

    var clientData = 70000
    var percentage = 16.7
    var timeYears = 20

    var capitalization = clientData * ((1 + percentage / 100)).pow(timeYears)
    println("%.${3}f".format(capitalization))

}