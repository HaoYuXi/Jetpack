package com.xlh.navigationdemo.frgament

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.xlh.navigationdemo.R
import kotlinx.android.synthetic.main.frg_login.*
import kotlinx.android.synthetic.main.frg_register.*
import kotlinx.android.synthetic.main.frg_register.tv_register

/**
Date: 20-4-29
Time: 上午11:43
Author: dain
 */
class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.frg_login, container, false)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_register.setOnClickListener {
            findNavController().navigate(R.id.toRegister)



        }

        tv_login.setOnClickListener {
            findNavController().navigate(R.id.backMain)

//            findNavController().navigateUp()
//            findNavController().popBackStack()
        }
    }




}