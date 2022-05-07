package com.example.im.controller.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.im.R;
import com.example.im.controller.activity.ApplyActivity;
import com.example.im.controller.activity.DetailActivity;
import com.example.im.controller.activity.LoginActivity;
import com.example.im.model.Model;
import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.widget.EaseTitleBar;

import androidx.fragment.app.Fragment;

import com.example.im.R;

public class LostFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.fragment_community, null);

        final ImageButton b = (ImageButton) view.findViewById(R.id.detail);
        final ImageButton a = (ImageButton) view.findViewById(R.id.apply);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(getActivity() , DetailActivity.class);

                startActivity(info);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(getActivity() ,ApplyActivity.class);

                startActivity(info);
            }
        });

        return view;

    }


}


