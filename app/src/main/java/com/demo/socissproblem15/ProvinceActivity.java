package com.demo.socissproblem15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ProvinceActivity extends AppCompatActivity {
    TextView textView;
    int pos;
    ArrayList<String> list;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        pos = intent.getIntExtra(MainActivity.EXTRA_POS,0);
        list = intent.getStringArrayListExtra(MainActivity.EXTRA_LIST);

        text="";
        for(int i=0; i <= pos; i++){
            text = text + list.get(i) +", ";
        }
        textView.setText(text);
    }
}
