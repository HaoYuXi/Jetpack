package com.xlh.navigationdemo

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.xlh.navigationdemo.viewmodle.UserModel

class WelcomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.act_welcone)
        Log.i("startActivity","start welcome")

        var userModel = viewModels<UserModel>()

        if (!UserModel.AuthenticationState.AUTHENTICATED.equals(userModel.value)){
            findNavController(R.id.loginActivity)
        }
        else{
            findNavController(R.id.mainFragment)

        }

    }



}