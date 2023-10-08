package com.example.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//THIS FACTORY IS BEING USED TO MAKE THE DATA

class MainViewModelFactory(val counter: Int): ViewModelProvider.Factory{
    // USED TO CREATE VIEW MODEL OBJECT i.e. DATA IS PASSED TO THE FACTORY AND FACTORY WILL DECIDE AND MAKE THE VIEW MODEL OBJECTS
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(counter) as T
    }
}