package ch.erni.basicmvvm.viewmodels

import android.content.Context
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import ch.erni.basicmvvm.models.Animal
import ch.erni.basicmvvm.views.MainActivity

class MainActivityViewModel (){

    private val animal= Animal("Dog", 0)

    val count = ObservableField<String>("${animal.name} barked ${animal.counter} times..")

    fun clickMe(){
        animal.counter++
        count.set("${animal.name} barked ${animal.counter} times..")
    }
}