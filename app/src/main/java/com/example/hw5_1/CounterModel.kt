package com.example.hw5_1

class CounterModel {

    private var count = 0

    fun inc(){
        count++
    }

    fun dec(){
        count--
    }

    fun getResult() = count

    fun counterCheck(callback: CounterCheckCallback){
        when (count) {
            10 -> callback.onNumberTen()
            15 -> callback.onNumberFifteen()
        }
    }

    interface CounterCheckCallback {
        fun onNumberTen()
        fun onNumberFifteen()
    }
}