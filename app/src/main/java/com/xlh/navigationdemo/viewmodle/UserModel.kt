package com.xlh.navigationdemo.viewmodle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
Date: 20-4-29
Time: 下午2:38
Author: dain
 */
class UserModel : ViewModel() {

    enum class AuthenticationState{
        UNAUTHENTICATED,        // Initial state, the user needs to authenticate
        AUTHENTICATED  ,        // The user has authenticated successfully
        INVALID_AUTHENTICATION  // Authentication failed
    }

    val authenticationState = MutableLiveData<AuthenticationState>()
    var username :String

    init {
        authenticationState.value = AuthenticationState.UNAUTHENTICATED
        username = ""
    }

    fun refuseAuthentication(){
        authenticationState.value = AuthenticationState.UNAUTHENTICATED
    }

    fun authentication(username : String, password: String){
        if (passwordIsValidForUsername(username,password)){
            this.username = username
            authenticationState.value = AuthenticationState.AUTHENTICATED
        }else{
            authenticationState.value = AuthenticationState.INVALID_AUTHENTICATION
        }
    }

    private fun passwordIsValidForUsername(username: String, password: String): Boolean {

        return false
    }




}