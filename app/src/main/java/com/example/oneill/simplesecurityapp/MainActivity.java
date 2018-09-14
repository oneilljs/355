package com.example.oneill.simplesecurityapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {



    public static final int REQUEST_CODE = 9;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view){
        Intent unlockActivity = new Intent(this, unlock.class);
        startActivityForResult(unlockActivity, REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        EditText text_Status = findViewById(R.id.status);
        if (resultCode == Activity.RESULT_OK){
            text_Status.setText("The App is UNLOCKED");
        }
        else{
            text_Status.setText("The App is LOCKED");
        }



    }
}
