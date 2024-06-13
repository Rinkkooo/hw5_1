package com.example.hw5_1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hw5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        presenter.attachView(this)

        with(binding){
            btnInc.setOnClickListener{
                presenter.onIncButtonClicked()
            }

            btnDec.setOnClickListener{
                presenter.onDecButtonClicked()
            }
        }
    }

    override fun updateCount(count: Int) {
        binding.tvCounterResult.text = count.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.tvCounterResult.setTextColor(color)
    }

    override fun resetColor() {
        binding.tvCounterResult.setTextColor(android.graphics.Color.BLACK)
    }
}