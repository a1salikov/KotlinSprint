package org.example

fun main (){

    val productivityBuffPercents = 20
    val bonusCrystalOre: Int = (CRYSTAL_ORE * (1 + productivityBuffPercents / 100)).toInt() - CRYSTAL_ORE
    val bonusIronOre: Int = (IRON_ORE * (1 + productivityBuffPercents / 100)).toInt() - IRON_ORE

    println(bonusCrystalOre)
    println(bonusIronOre)

}

const val CRYSTAL_ORE = 7
const val IRON_ORE = 11