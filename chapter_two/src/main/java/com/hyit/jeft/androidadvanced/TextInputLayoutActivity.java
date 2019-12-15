package com.hyit.jeft.androidadvanced;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayoutActivity extends AppCompatActivity {

    private static final String TAG = "TextInputLayoutActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        TextInputLayout tl_username = findViewById(R.id.tl_username);
        TextInputLayout tl_password = findViewById(R.id.tl_password);
        AppCompatButton btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(view ->{
            String username = tl_username.getEditText().getText().toString();
            Log.e(TAG, "onCreate: "+username );

        });
//        tl_username.setError("请输入用户名");
    }
}
