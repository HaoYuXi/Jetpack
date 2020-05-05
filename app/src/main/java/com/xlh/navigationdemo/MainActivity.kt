package com.xlh.navigationdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.xlh.navigationdemo.viewmodle.NumberModel
import com.xlh.navigationdemo.viewmodle.UserModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("startActivity","start MainActivity")

        findNavController(R.id.mainFragment).navigateUp()


    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.mainFragment).navigateUp()
    }
}
