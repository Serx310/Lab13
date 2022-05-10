package com.bubnov.lab13.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> text;

    public HomeViewModel(){
        text = new MutableLiveData<>();
        text.setValue("this is home fragment");
    }

    public LiveData<String> getText(){
        return text;
    }
}