package com.bellman.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);


        //set the onclick listener for the buttons
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id==R.id.button1){
            showToast("I will launch my popular movies app here");
        }else if(id==R.id.button2){
            showToast("I will show my stock hawk app here");
        }else if (id==R.id.button3){
            showToast("This time around, i will build it bigger");
        }else if(id==R.id.button4){
            showToast("I will make my app material here");
        }else if(id==R.id.button5){
            showToast("I will go ubiquitous here");
        }else if(id==R.id.button6){
            showToast("Capstone: i will show my own app here!");
        }

    }

    private void showToast(String s) {
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}
