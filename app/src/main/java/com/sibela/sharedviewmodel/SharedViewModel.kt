package com.sibela.sharedviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _county = MutableLiveData("Brazil")
    val county: LiveData<String> = _county

    fun saveCountr(newCountry: String) {
        _county.value = newCountry
    }
}