package com.xlh.navigationdemo.frgament

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.xlh.navigationdemo.R
import kotlinx.android.synthetic.main.frg_login.*

/**
Date: 20-4-29
Time: 上午11:43
Author: dain
 */
class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frg_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_register.setOnClickListener {
            findNavController().navigate(R.id.backMain)
        }


    }
}