package com.example.cleanarchkotlin.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<V : BaseViewModel> : AppCompatActivity() {

    abstract fun getLayout(): Int
    lateinit var viewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        viewModel = ViewModelProvider(this)[getViewModelClass()]
    }

    private inline fun <reified V : BaseViewModel> getViewModelClass(): Class<V> = V::class.java


}