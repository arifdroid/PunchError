package com.example.afinal.fingerPrint_Login.new_fingerprint_btmnavview_login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.afinal.R;

public class OurFragmentWifi extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     //   return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.wifi_icon_fragment,container,false);

        textView = rootView.findViewById(R.id.textViewWifiIconFragment);


        textView.setText("wifi rumah");


        return rootView;
    }
}
