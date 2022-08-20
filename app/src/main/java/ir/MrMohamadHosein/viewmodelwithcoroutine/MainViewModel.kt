package ir.MrMohamadHosein.viewmodelwithcoroutine

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel :ViewModel() {

    init {

        val apiService = ApiServiceSingleton.apiService!!

        viewModelScope.launch(Dispatchers.IO) {

            Log.v("testLog" , Thread.currentThread().name)

            val data = apiService.getAllStudents()
            Log.v("testLog" , data.toString())

        }

    }


}