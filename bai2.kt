package com.example.lab1

import kotlin.math.PI
import kotlin.math.pow

class bai2 {

    // Lớp trừu tượng Dwelling
    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract fun floorArea(): Double

        fun hasRoom(): Boolean {
            return residents < 4
        }
    }

    class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
        override val buildingMaterial = "Wood"
        override fun floorArea() = length * length
    }

    open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
        override val buildingMaterial = "Straw"
        override fun floorArea() = PI * radius.pow(2)
    }

    class RoundTower(residents: Int, radius: Double, val floors: Int) : RoundHut(residents, radius) {
        override val buildingMaterial = "Stone"
        override fun floorArea() = super.floorArea() * floors
    }
}

/**
 * Hàm main — nơi chương trình bắt đầu thực thi.
 */
fun main() {
    val dwellings = listOf(
        bai2.SquareCabin(3, 10.0),
        bai2.RoundHut(2, 5.0),
        bai2.RoundTower(4, 4.5, 3)
    )

    println("=== Danh sách nhà ===")
    for (dwelling in dwellings) {
        with(dwelling) {
            println("-----")
            println("Vat lieu : $buildingMaterial")
            println("Dien tich : ${floorArea()} m²")
            println("Con cho trong  ${hasRoom()}")
        }
    }
}
