package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed1 = findViewById(R.id.mm4);
        EditText ed2 = findViewById(R.id.mm5);

        Button b3 = findViewById(R.id.button);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ed1.getText().toString().equals("")) {
                } else if (ed2.getText().toString().equals("")) {
                } else{

                    Intent intent = new Intent(MainActivity.this, Page2Activity.class);

                    String Fatema = ed1.getText().toString();
                    int nationalID = Integer.parseInt(ed2.getText().toString());


                intent.putExtra("name", Fatema);
                intent.putExtra("nationalID", nationalID);


                startActivity(intent);
            }
            }
        });



    }
}