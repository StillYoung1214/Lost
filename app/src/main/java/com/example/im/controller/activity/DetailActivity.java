package com.example.im.controller.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.im.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageButton b = findViewById(R.id.iv_detail);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, AddContactActivity.class);
                startActivity(intent);
            }
        });

    }
}