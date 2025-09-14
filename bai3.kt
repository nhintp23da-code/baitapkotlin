package com.example.lab1

class bai3 {

}


fun main() {
    print("Nhap ban kinh hinh tron: ")
    val banKinh = readLine()!!.toDouble()

    val chuVi = 2 * Math.PI * banKinh
    val dienTich = Math.PI * banKinh * banKinh

    println("Chu vi hinh tron: $chuVi")
    println("Dien tich hinh tron: $dienTich")
}
