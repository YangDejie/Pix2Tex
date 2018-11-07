package com.idejie.android.pix2tex.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.idejie.android.pix2tex.R;

public class SignActivity extends AppCompatActivity {
    Button btn_sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        btn_sign = findViewById(R.id.sign_btn);
        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignActivity.this,MainActivity.class);
                startActivity(intent);
                SignActivity.this.finish();
            }
        });
    }
}
