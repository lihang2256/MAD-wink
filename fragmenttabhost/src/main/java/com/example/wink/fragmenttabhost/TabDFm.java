package com.example.wink.fragmenttabhost;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bonc.fragmenttabhost.R;

public class TabDFm extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("DDDDDDDDD____onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("DDDDDDDDD____onCreateView");
        return inflater.inflate(R.layout.tab_d, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("DDDDDDDDD____onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("DDDDDDDDD____onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("DDDDDDDDD____onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("DDDDDDDDD____onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("DDDDDDDDD____onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("DDDDDDDDD____onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("DDDDDDDDD____onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("DDDDDDDDD____onDetach");
    }

}
