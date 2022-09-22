package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.text.InputFilter;
import android.text.TextUtils;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView txtview;
    private EditText input;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Random rnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    input.setText(input.getText().toString().toUpperCase());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString().toLowerCase());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                txtview.setBackgroundColor(Color.rgb(red,green,blue));
                if ((red+green+blue)>450){
                    txtview.setTextColor(Color.BLACK);
                }
                else{
                    txtview.setTextColor(Color.WHITE);
                }
            }
        });

    }
    private void init() {
        layout = findViewById(R.id.layout);
        txtview = findViewById(R.id.txtview);
        input = findViewById(R.id.input);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        rnd = new Random();

    }
}