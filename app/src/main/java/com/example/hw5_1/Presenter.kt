package com.example.hw5_1

class Presenter {

    private val model = CounterModel()
    private var view: CounterView? = null

    fun attachView(view: CounterView){
        this.view = view
    }

    fun onIncButtonClicked(){
        model.inc()
        view?.updateCount(model.getResult())
        model.counterCheck(object: CounterModel.CounterCheckCallback{
            override fun onNumberTen() {
                view?.showToast("Поздравляем")
            }

            override fun onNumberFifteen() {
                view?.changeColor(android.graphics.Color.GREEN)
            }
        })
        if (model.getResult() != 15){
            view?.resetColor()
        }
    }

    fun onDecButtonClicked(){
        model.dec()
        view?.updateCount(model.getResult())
    }


    fun detachView(){
        this.view = null
    }
}