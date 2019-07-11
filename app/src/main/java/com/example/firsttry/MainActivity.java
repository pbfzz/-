package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("nothing");
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        final TextView tv2 = findViewById(R.id.tv2);
        final ImageView iv1 = findViewById(R.id.iv1);
        final Switch sw1 = findViewById(R.id.sw1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View z) {
                tv2.setText("something");
                iv1.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.INVISIBLE);
                sw1.setVisibility(View.VISIBLE);
            }
        });


        Button btn3 = findViewById(R.id.btn3);
        final Button btn4 = findViewById(R.id.btn4);
        final EditText et1 = findViewById(R.id.et1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View x) {
                tv2.setText("输入");
                iv1.setVisibility(View.INVISIBLE);
                et1.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                sw1.setVisibility(View.INVISIBLE);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View x) {
                System.exit(0);
        }
        });
    }
}
