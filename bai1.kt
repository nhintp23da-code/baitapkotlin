package com.example.lab1

class bai1 {
    // Khong can them ma o day.
}

/**
 * Ham chinh (main) cua chuong trinh.
 * Noi chuong trinh bat dau thuc thi.
 */
fun main() {
    // 1. In van ban va chu thich
    println("Chao mung den voi chuong trinh Kotlin! 👋")
    println("Day la mot vi du tong hop ve cac khai niem co ban.")

    println("\n--- BIEN VA KIEU DU LIEU ---")
    // 2. Bien (val va var)
    // val: gan mot lan, khong the thay doi
    val greetingText: String = "Hello, everyone!"
    // var: co the gan lai gia tri
    var myNumber: Int = 10
    val myBoolean: Boolean = true

    println("Gia tri cua val: ${greetingText}")
    println("Gia tri ban dau cua var: ${myNumber}")
    myNumber = 20
    println("Gia tri moi cua var: ${myNumber}")

    println("\n--- HAM ---")
    // 3. Ham khong co doi so
    printBorder()
    println("Cac ham co the duoc goi nhu the nay!")
    printBorder()

    // 4. Ham co doi so
    println("\nIn ra mot duong vien tuy chinh:")
    printCustomBorder("=", 30)

    // 5. Ham tra ve gia tri
    val randomRoll = roll()
    println("Gia tri xuc xac ngau nhien la: ${randomRoll}")

    println("\n--- CAU LENH DIEU KIEN ---")
    // 6. Cau lenh if/else
    val num = 7
    if (num > 5) {
        println("So ${num} lon hon 5.")
    } else if (num == 5) {
        println("So ${num} bang 5.")
    } else {
        println("So ${num} nho hon 5.")
    }

    // 7. Cau lenh when
    val rollResult = roll()
    println("Ket qua tung xuc xac cho 'when' la: ${rollResult}")
    when (rollResult) {
        6 -> println("Chuc mung, ban da tung duoc 6!")
        1 -> println("Khong may, ban da tung duoc 1. Thu lai!")
        else -> println("Ket qua la ${rollResult}. Hay thu lai!")
    }

    println("\n--- LOP ---")
    // 8. Tao thuc the cua lop Dice
    val myDice = Dice(6)
    val myDiceRoll = myDice.roll()
    println("Lop 'Dice' tung duoc gia tri: ${myDiceRoll}")
}

// Ham khong co doi so de in mot duong vien mac dinh
fun printBorder() {
    repeat(25) {
        print("-")
    }
    println()
}

// Ham co doi so de in mot duong vien tuy chinh
fun printCustomBorder(borderChar: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(borderChar)
    }
    println()
}

// Ham tra ve mot gia tri ngau nhien
fun roll(): Int {
    return (1..6).random()
}

/**
 * Lop Dice mo phong mot con xuc xac.
 * No co mot thuoc tinh la so mat va mot phuong thuc de tung xuc xac.
 */
class Dice (val numSides: Int) {
    /**
     * Phuong thuc tung xuc xac va tra ve mot so ngau nhien.
     */
    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
    
}