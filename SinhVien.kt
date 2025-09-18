package com.example.lab1
class SinhVien {
    private var ma:Int = 0
    private var ten:String = ""

    public var Ma:Int
        get() {
            return ma
        }
        set(value) {
            ma = value
        }

    public var Ten:String
        get() {
            return ten
        }
        set(value) {
            ten = value
        }

    constructor() {
        println("Day la secondary constructor 0 doi so")
    }

    constructor(ma:Int, ten:String) {
        println("Day la secondary constructor 2 doi so")
        println("Ma=$ma ; Ten=$ten")
    }

    fun xuatThongTin() {
        println("Thong tin chi tiet:")
        println("Ma = " + ma)
        println("Ten = " + ten)
    }

    fun layTenVietHoa(): String {
        return ten.uppercase()
    }
}

fun main(args: Array<String>) {
    var hanh = SinhVien()
    hanh.Ma = 113
    hanh.Ten = "Ho Thi Hanh"
    println("Thong tin cua Hanh:")
    println("Ma: " + hanh.Ma)
    println("Ten: " + hanh.Ten)

    // Goi phuong thuc
    hanh.xuatThongTin()
    println("Ten viet hoa: " + hanh.layTenVietHoa())
}

