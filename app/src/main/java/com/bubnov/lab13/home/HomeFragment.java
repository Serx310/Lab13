package com.bubnov.lab13.home;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bubnov.lab13.R;
import com.bubnov.lab13.databinding.HomeFragmentBinding;
import com.bubnov.lab13.databinding.SecondFragmentBinding;
import com.bubnov.lab13.second.SecondViewModel;

public class HomeFragment extends Fragment {

    private HomeFragmentBinding binding;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        SecondViewModel secondViewModel = new ViewModelProvider(this).get(SecondViewModel.class);
        binding = HomeFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textHome;
        secondViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

}