package com.example.hw5_1

interface CounterView {

    fun updateCount(count: Int)
    fun showToast(message: String)
    fun changeColor(color: Int)
    fun resetColor()
}