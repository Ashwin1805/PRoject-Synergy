package com.example.synergy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Next_Butt;
    EditText Name_ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name_ET = findViewById(R.id.ET1_FN);
        Next_Butt = findViewById(R.id.But1_nxt);
        Next_Butt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View V) {openHome();}
        });


    }

    public void openHome(){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
}