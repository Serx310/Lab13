package com.bubnov.lab13.second;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SecondViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> text;

    public SecondViewModel(){
        text = new MutableLiveData<>();
        text.setValue("this is second fragment");
    }

    public LiveData<String> getText(){
        return text;
    }
}