package com.example.oneill.simplesecurityapp;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class unlock extends AppCompatActivity {
    int state=0,count=0;
    String UNLOCK_CODE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock);
        state=0;
        count=0;
        UNLOCK_CODE = "";
    }

    public void button_code(View view){
        EditText text = findViewById(R.id.text_change);
        UNLOCK_CODE = text.getText().toString();

        switch (view.getId()){

            case R.id.button2:
                if((state == 0)&(count==0))state= 1;
                count++;
                text.append("1");
                break;

            case R.id.button3:
                if((state == 1)&(count==1)) state= 2;
                count++;
                text.append("2");
                break;

            case R.id.button4:
                if((state == 2)&(count==2))state= 3;
                count++;
                text.append("3");
                break;

            case R.id.button5:
                if((state == 3)&(count==3))state= 4;
                count++;
                text.append("4");
                break;

            case R.id.button6:
                Intent intent = new Intent();
                intent.putExtra("message",state);
                if(UNLOCK_CODE.equals("1234"))setResult(Activity.RESULT_OK,intent);
                else setResult(Activity.RESULT_CANCELED,intent);
                finish();
                break;
        }
    }
}
