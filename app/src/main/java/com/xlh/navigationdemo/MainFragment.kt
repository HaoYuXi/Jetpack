package com.xlh.navigationdemo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.xlh.navigationdemo.viewmodle.NumberModel
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i("record fragment log","mainFragment   onCreateView")

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("record fragment log","mainFragment  onViewCreated")

        val numberModel by viewModels<NumberModel>()
        val model = ViewModelProviders.of(this).get(NumberModel::class.java)


        tv_toLogin.setOnClickListener{
//            this@MainFragment.findNavController().navigate(R.id.login)
            findNavController().navigate(R.id.login)
        }

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
