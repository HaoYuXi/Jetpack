package com.xlh.navigationdemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.xlh.navigationdemo.viewmodle.NumberModel
import com.xlh.navigationdemo.viewmodle.UserModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberModel by viewModels<NumberModel>()
        val model = ViewModelProviders.of(this).get(NumberModel::class.java)



        textView.text = numberModel.number.toString()


        plus1.setOnClickListener {
            numberModel.plusOne()
//            numberModel.number ++
            textView.text = numberModel.number.toString()

        }
        plus2.setOnClickListener {
            numberModel.plusTwo()
//            numberModel.number +=2
            textView.text = numberModel.number.toString()

        }









    }
}
