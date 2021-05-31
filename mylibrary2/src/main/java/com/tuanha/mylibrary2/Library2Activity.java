package com.tuanha.mylibrary2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Library2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library2);
        ((TextView)findViewById(R.id.tvText)).setText(Library2.token);
    }
}
