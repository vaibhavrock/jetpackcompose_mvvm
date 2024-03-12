package com.example.myapplication.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.IpInfo
import com.example.myapplication.util.RetrofitInstance
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    private val _ipInfo = MutableLiveData<IpInfo>()
    val ipInfo: LiveData<IpInfo> = _ipInfo

    fun fetchIpInfo(){
        viewModelScope.launch {
            try {
                _ipInfo.value = RetrofitInstance.apiService.getIpInfo()
            }
            catch (e:Exception){
                e.printStackTrace()
            }
        }
    }
}



