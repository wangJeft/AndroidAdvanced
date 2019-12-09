package com.hyit.jeft.androidadvanced;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton btn_snackbar;
    private ConstraintLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_main = findViewById(R.id.activity_main);
        btn_snackbar = findViewById(R.id.btn_snackbar);
        btn_snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar();
            }
        });
    }

    private void showSnackbar() {
        Snackbar.make(activity_main, "友好提示!", Snackbar.LENGTH_SHORT)
                .setAction("点击事件", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "SnackBar被点击!", Toast.LENGTH_SHORT).show();
                    }
                })
//                .setDuration(2500)//snackbar弹出的持续时间
                .show();

    }
}
