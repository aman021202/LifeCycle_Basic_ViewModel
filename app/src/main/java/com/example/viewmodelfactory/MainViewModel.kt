package com.example.viewmodelfactory

import androidx.lifecycle.ViewModel

//UI DATA DEFINED AND LOGIC , Views used to show the data and view model holds the data

class MainViewModel(val initialValue: Int): ViewModel() {
    var count: Int = initialValue

    fun increment(){
        count++
    }
}