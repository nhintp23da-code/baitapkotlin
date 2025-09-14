package com.example.lab1

import kotlinx.coroutines.*
import kotlin.Exception

class bai4 {

    // Ham tam ngung (suspend function)
    suspend fun getValue(): Double {
        delay(1000)
        return Math.random()
    }

    // Goi ham tam ngung trong GlobalScope
    fun runGlobalScope() {
        GlobalScope.launch {
            val output = getValue()
            println("GlobalScope: $output")
        }
    }

    // Goi ham tam ngung tu mot ham tam ngung khac
    suspend fun processValue() {
        val value = getValue()
        println("Processed value: ${value * 2}")
    }

    // Truy cap vao mot Job coroutine va huy no
    fun runAndCancelJob() {
        val job: Job = GlobalScope.launch {
            val output = getValue()
            println("Job output: $output")
        }
        job.cancel()
    }

    // Chay ham tam ngung va chan luong hien tai cho toi khi xong
    fun runBlockingExample() {
        runBlocking {
            val output = getValue()
            println("RunBlocking output: $output")
        }
    }

    // Su dung async de cho phep tri hoan ham tam ngung
    fun runAsyncExample() {
        runBlocking {
            val output = async { getValue() }
            println("Output is ${output.await()}")
        }
    }

    // Khai bao mot object
    object DataProviderManager {
        val name = "Data Provider"
    }

    // Phat hien ngoai le
    fun testException() {
        try {
            throw Exception("Co loi xay ra")
        } catch (exception: Exception) {
            println("Bat ngoai le: ${exception.message}")
        }
    }

    // Tao mot lop enum
    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    // Truy cap vao va kiem tra gia tri enum
    fun checkDirection() {
        val direction = Direction.NORTH
        when (direction) {
            Direction.NORTH -> println("Di len")
            Direction.SOUTH -> println("Di xuong")
            Direction.WEST -> println("Di sang trai")
            Direction.EAST -> println("Di sang phai")
        }
    }
}

fun main() {
    val b4 = bai4()

    b4.runGlobalScope()
    b4.runBlockingExample()
    b4.runAsyncExample()
    b4.testException()
    b4.checkDirection()

    runBlocking {
        b4.processValue()
    }
}
