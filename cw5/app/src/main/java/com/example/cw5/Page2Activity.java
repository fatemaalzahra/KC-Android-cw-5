package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        TextView customernameTextView = findViewById(R.id.t5);
        TextView nationalIDTextView = findViewById(R.id.textView8);


        Bundle bundle = getIntent().getExtras();


        // Customer name
        String name = bundle.getString("name");
        customernameTextView.setText(name);
        //National ID
        int nationalID = bundle.getInt("nationalID");
        nationalIDTextView.setText(String.valueOf(nationalID));
        //destination



    }

}