package com.example.synergy;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;

public class fav_contacts extends AppCompatActivity {

    ImageButton back;
    ImageButton add;

    private static final int PERMISSIONS_REQUEST_READ_CONTACTS = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_contacts);

        back = findViewById(R.id.IBut3_back);
        add = findViewById(R.id.IBut3_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back_home) {
                back2home();
            }
        });

    }

    public void back2home() {
        Intent bh = new Intent(this, home.class);
        startActivity(bh);
    }


}