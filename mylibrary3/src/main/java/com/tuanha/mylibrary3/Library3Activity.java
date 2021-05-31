package com.tuanha.mylibrary3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Library3Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library3);


        ((TextView) findViewById(R.id.tvText)).setText(
                Library3.library3Source.getBaseUrl() + "\n" + Library3.library3Source.getToken() + "\n" + Library3.library3Source.decode("library 3") + "\n"
        );
    }
}