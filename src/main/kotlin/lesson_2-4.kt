package org.example

fun main (){

    val crystalOre: Int = 7
    val ironOre: Int = 11

    val bonusCrystalOre: Int = (crystalOre * 1.2).toInt() - crystalOre
    val bonusIronOre: Int = (ironOre * 1.2).toInt() - ironOre

    println(bonusCrystalOre)
    println(bonusIronOre)

}