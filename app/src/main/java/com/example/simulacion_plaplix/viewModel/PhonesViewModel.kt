package com.example.simulacion_plaplix.viewModel

import androidx.lifecycle.AndroidViewModel
import com.example.simulacion_plaplix.PhonesRepository

class PhonesViewModel : AndroidViewModel (){

    private val mRepository : PhonesRepository

    init {
        mRepository = PhonesRepository()
    }


}