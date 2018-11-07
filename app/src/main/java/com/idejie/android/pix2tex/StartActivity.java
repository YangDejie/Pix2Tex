package com.idejie.android.pix2tex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.idejie.android.pix2tex.activities.LoginActivity;
import com.idejie.android.pix2tex.activities.SignActivity;

public class StartActivity extends AppCompatActivity {
    Button btn_sign;
    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        btn_sign = findViewById(R.id.main_sign);
        tv_login = findViewById(R.id.main_login);
        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartActivity.this, SignActivity.class);
                startActivity(intent);
                StartActivity.this.finish();
            }
        });
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
                StartActivity.this.finish();
            }
        });
    }
}
