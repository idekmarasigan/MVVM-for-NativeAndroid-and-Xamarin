package ch.erni.basicmvvm.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ch.erni.basicmvvm.R
import ch.erni.basicmvvm.databinding.ActivityMainBinding
import ch.erni.basicmvvm.models.Animal
import ch.erni.basicmvvm.viewmodels.MainActivityViewModel


class MainActivity : AppCompatActivity() {
    
    lateinit var activityMainBinding : ActivityMainBinding
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainActivityViewModel= MainActivityViewModel()

        activityMainBinding.vm = mainActivityViewModel
    }

}